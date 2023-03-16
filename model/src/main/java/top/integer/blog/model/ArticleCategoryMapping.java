package top.integer.blog.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleCategoryMapping {

    @ApiModelProperty(value = "文章id")
    private Long articleId;

    @ApiModelProperty(value = "分类id")
    private Long categoryId;

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


}
