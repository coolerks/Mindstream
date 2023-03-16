package top.integer.blog.dto;

import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Size;

@ApiModel(description = "分类Dto")
@Data
@ToString
public class CategoryDto {
    @NotNull(message = "名称不能为空")
    @Size(min = 1, max = 20, message = "名称长度必须在1~20之间")
    @ApiModelProperty(value = "名称", example = "Java")
    private String name;

    @ApiModelProperty(value = "别名", example = "java")
    @Size(min = 0, max = 20, message = "别名长度必须小于20")
    private String alias;

    @ApiModelProperty(value = "描述", example = "Java编程语言")
    private String description;

    @ApiModelProperty(value = "父结点的id", example = "0")
    private Long parentId;

    @ApiModelProperty(value = "访问密码，留空代表无密码", example = "123456")
    private String password;

}
