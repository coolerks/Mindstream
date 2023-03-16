package top.integer.blog.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel(description = "友情链接传输对象")
@Data
public class FriendLinkDto {

    @NotBlank(message = "网站名称不能为空")
    @ApiModelProperty(value = "网站名称", example = "Google", required = true)
    private String siteName;

    @NotBlank(message = "网站链接不能为空")
    @ApiModelProperty(value = "网站链接", example = "https://www.google.com", required = true)
    @Pattern(regexp = "^https?://[\\w\\-.]+(\\/[\\w\\-./?%&=]*)?$", message = "网站链接格式不正确")
    private String siteUrl;

    @NotBlank(message = "logo链接不能为空")
    @ApiModelProperty(value = "logo链接", example = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", required = true)
    @Pattern(regexp = "^https?://[\\w\\-.]+(\\/[\\w\\-./?%&=]*)?$", message = "logo链接格式不正确")
    private String logoUrl;

    @NotBlank(message = "网站描述不能为空")
    @ApiModelProperty(value = "网站描述", example = "Google 搜索引擎", required = true)
    private String description;

    @NotNull(message = "排序权重不能为空")
    @ApiModelProperty(value = "排序权重", example = "1", required = true)
    private Integer sort;
}
