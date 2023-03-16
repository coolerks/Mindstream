package top.integer.blog.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "友情链接")
public class FriendLinkVo {

    @ApiModelProperty(value = "友情链接id", example = "1")
    private Long id;

    @ApiModelProperty(value = "网站名称", example = "Google")
    private String siteName;

    @ApiModelProperty(value = "网站链接", example = "https://www.google.com")
    private String siteUrl;

    @ApiModelProperty(value = "logo链接", example = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png")
    private String logoUrl;

    @ApiModelProperty(value = "网站描述", example = "Google 搜索引擎")
    private String description;

    @ApiModelProperty(value = "排序权重", example = "1")
    private Integer sort;

}
