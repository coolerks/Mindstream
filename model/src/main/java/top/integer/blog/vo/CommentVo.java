package top.integer.blog.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import top.integer.blog.dto.CommentDto;

@Data
@ApiModel("评论VO")
public class CommentVo extends CommentDto {

    @ApiModelProperty("评论id")
    private Long id;

    @ApiModelProperty("评论者ip")
    private String ip;
}
