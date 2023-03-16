package top.integer.blog.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@ToString
public abstract class BaseEntry {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("id编号")
    private Long id;
    @TableField("create_time")
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @TableField("update_time")
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;
    @TableField("is_delete")
    @TableLogic
    @ApiModelProperty("是否逻辑删除")
    private Boolean isDelete;

    @TableField(exist = false)
    @ApiModelProperty("可以带有的参数")
    private Map<String, Object> params;
}
