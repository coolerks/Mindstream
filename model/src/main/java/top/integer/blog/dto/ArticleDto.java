package top.integer.blog.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@ToString
public class ArticleDto {
    @ApiModelProperty("文章标题")
    @Size(min = 1, max = 256, message = "标题的长度应大于1小于256")
    private String title;

    @ApiModelProperty("文章别名")
    @Size(min = 0, max = 256, message = "别名的长度应小于256")
    private String alias;


    @ApiModelProperty("文章描述")
    @Size(min = 0, max = 256, message = "描述的长度应小于256")
    private String description;

    @ApiModelProperty("封面图")
//    file://aliyun.oss
//    file://local.file
    @Pattern(regexp = "^(http|https|file)\\:\\/\\/([a-zA-Z0-9\\.\\-]+(\\:[a-zA-Z0-9\\.&%\\$\\-]+)*@)?((25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])|([a-zA-Z0-9\\-]+\\.)*[a-zA-Z0-9\\-]+\\.[a-zA-Z]{2,4})(\\:[0-9]+)?(\\/[^\\/][a-zA-Z0-9\\.\\,\\?\\'\\\\\\/\\+&%\\$#\\=~_\\-@]*)*$", message = "封面图不合法")
    @Size(max = 256, message = "封面图url长度不能大于256")
    private String coverPictureUrl;

    @ApiModelProperty("是否允许评论")
    @NotNull
    private Boolean allowComment;

    @ApiModelProperty("文章内容")
    @NotBlank(message = "文章内容不能为空")
    private String content;

    @ApiModelProperty("访问密码，留空代表没有")
    @Size(min = 0, max = 20)
    private String password;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime createTime;
}
