package top.integer.blog.vo;

import lombok.Data;
import lombok.ToString;
import top.integer.blog.dto.ArticleTagMappingDto;

import java.time.LocalDateTime;

@Data
@ToString
public class ArticleTagMappingVo extends ArticleTagMappingDto {
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
