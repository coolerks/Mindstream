package top.integer.blog.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import top.integer.blog.base.BaseEntry;

@TableName("tag")
@Data
@ToString
public class Tag extends BaseEntry {

    private String name;

    private String color;

    private String alias;

    private String coverPicture;
}
