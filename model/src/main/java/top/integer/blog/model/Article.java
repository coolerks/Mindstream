package top.integer.blog.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import top.integer.blog.base.BaseEntry;


@Data
@TableName("article")
@ToString
@ApiModel(value = "文章类", description = "文章表对应的实体类")
public class Article extends BaseEntry {
    @ApiModelProperty("文章标题")
    private String title;

    @ApiModelProperty("文章别名")
    private String alias;

    @ApiModelProperty("文章描述")
    private String description;

    @TableField("cover_picture_url")
    @ApiModelProperty("封面图")
    private String coverPictureUrl;

    @TableField("allow_comment")
    @ApiModelProperty("是否允许评论")
    private Boolean allowComment;

    @ApiModelProperty("文章内容")
    private String content;

    @ApiModelProperty("访问密码，留空代表没有")
    private String password;
}
