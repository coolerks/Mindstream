package top.integer.blog.dto;

import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@ApiModel(description = "文章标签映射Dto")
@ToString
@Data
public class ArticleTagMappingDto {
    @NotNull(message = "文章id不能为空")
    @ApiModelProperty(value = "文章id", example = "1")
    private Long articleId;

    @NotNull(message = "标签id不能为空")
    @ApiModelProperty(value = "标签id", example = "1")
    private Long tagId;

}
