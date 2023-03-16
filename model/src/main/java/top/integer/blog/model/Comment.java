package top.integer.blog.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("comment")
public class Comment {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long articleId;
    private String content;
    private String email;
    private String nickname;
    private String site;
    private Long parentId;
    @TableLogic
    private Integer isDelete;
    private String ip;
    private LocalDateTime createTime;
}
