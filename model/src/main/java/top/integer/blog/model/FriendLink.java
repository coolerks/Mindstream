package top.integer.blog.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.integer.blog.base.BaseEntry;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("friend_link")
public class FriendLink extends BaseEntry {

    private String siteName;

    private String siteUrl;

    private String logoUrl;

    private String description;

    private Integer sort;
}
