package top.integer.blog.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@ApiModel(description = "标签视图对象")
public class TagDto {

    @ApiModelProperty(value = "标签id", example = "1")
    private Long id;

    @NotBlank(message = "名称不能为空")
    @Size(max = 20, message = "名称长度不能超过20个字符")
    @ApiModelProperty(value = "名称", example = "Java")
    private String name;

    @Pattern(regexp = "^#([0-9a-fA-F]{6}|[0-9a-fA-F]{3})$", message = "颜色值格式不正确")
    @ApiModelProperty(value = "颜色", example = "#FFFFFF")
    private String color;

    @Size(max = 20, message = "别名长度不能超过20个字符")
    @ApiModelProperty(value = "别名", example = "Java基础")
    private String alias;

    @NotBlank(message = "封面图不能为空")
    @Size(max = 256, message = "封面图长度不能超过256个字符")
    @ApiModelProperty(value = "封面图", example = "https://example.com/image.jpg")
    @Pattern(regexp = "^(http|https|file)\\:\\/\\/([a-zA-Z0-9\\.\\-]+(\\:[a-zA-Z0-9\\.&%\\$\\-]+)*@)?((25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])|([a-zA-Z0-9\\-]+\\.)*[a-zA-Z0-9\\-]+\\.[a-zA-Z]{2,4})(\\:[0-9]+)?(\\/[^\\/][a-zA-Z0-9\\.\\,\\?\\'\\\\\\/\\+&%\\$#\\=~_\\-@]*)*$", message = "封面图不合法")
    private String coverPicture;
}
