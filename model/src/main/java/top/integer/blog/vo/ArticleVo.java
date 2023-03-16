package top.integer.blog.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import top.integer.blog.dto.ArticleDto;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("article")
@ToString
@ApiModel(value = "文章类", description = "文章表对应的实体类")
public class ArticleVo extends ArticleDto {
    @ApiModelProperty("id编号")
    private Long id;
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

    @TableField("create_time")
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @TableField("update_time")
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;
}
