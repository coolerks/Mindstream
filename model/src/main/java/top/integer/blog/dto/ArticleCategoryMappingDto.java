package top.integer.blog.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ArticleCategoryMappingDto {

    @ApiModelProperty(value = "文章id")
    private Long articleId;

    @ApiModelProperty(value = "分类id")
    private Long categoryId;

}
