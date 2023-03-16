package top.integer.blog.vo;

import lombok.Data;
import lombok.ToString;
import top.integer.blog.dto.CategoryDto;

import java.time.LocalDateTime;

@ToString
@Data
public class CategoryVo extends CategoryDto {
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
