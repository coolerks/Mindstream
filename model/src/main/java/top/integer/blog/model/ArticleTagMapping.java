package top.integer.blog.model;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.ToString;

@TableName("article_tag_mapping")
@Data
@ToString
public class ArticleTagMapping {
    @TableId(value = "article_id", type = IdType.INPUT)
    private Long articleId;

    @TableField("tag_id")
    private Long tagId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableLogic
    private Boolean isDelete;
}
