package top.integer.blog.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import top.integer.blog.dto.TagDto;
import java.time.LocalDateTime;

@Data
@ApiModel(description = "标签视图对象")
public class TagVo extends TagDto {

    @ApiModelProperty(value = "标签id", example = "1")
    private Long id;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;
}
