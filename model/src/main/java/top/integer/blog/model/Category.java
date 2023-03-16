package top.integer.blog.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import top.integer.blog.base.BaseEntry;

@TableName("category")
@Data
@ToString
public class Category extends BaseEntry {
    @TableField("name")
    private String name;

    @TableField("alias")
    private String alias;

    @TableField("description")
    private String description;

    @TableField("parent_id")
    private Long parentId;

    @TableField("password")
    private String password;


}
