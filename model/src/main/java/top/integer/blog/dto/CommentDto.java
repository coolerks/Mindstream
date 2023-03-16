package top.integer.blog.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
public class CommentDto {
    @ApiModelProperty("文章id")
    @NotNull(message = "文章id不能为空")
    private Long articleId;

    @ApiModelProperty("评论内容")
    @NotBlank(message = "评论内容不能为空")
    @Size(max = 65535, min = 5, message = "评论内容长度不能小于5")
    private String content;

    @ApiModelProperty("评论者的邮箱")
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    @Size(max = 30, message = "邮箱长度不能超过30")
    private String email;

    @ApiModelProperty("评论者的昵称")
    @NotBlank(message = "昵称不能为空")
    @Size(max = 20, message = "昵称长度不能超过20")
    private String nickname;

    @ApiModelProperty("评论者的站点")
    @NotBlank(message = "站点不能为空")
    @Size(max = 200, message = "站点长度不能超过200")
    private String site;

    @ApiModelProperty("父id")
    @NotNull
    private Long parentId;
}
