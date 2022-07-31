package fun.jilijili.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @TableName music_user
 */
@TableName(value ="music_user")
@Data
public class MusicUser implements Serializable {
    /**
     * 唯一用户id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 登录方式：网易云，qq音乐，咪咕
     */
    @TableField(value = "login_func")
    private String login_func;

    /**
     * ip地址
     */
    @TableField(value = "addr_ip")
    private String addr_ip;

    /**
     * 城市
     */
    @TableField(value = "addr_city")
    private String addr_city;

    /**
     * 上次登录时间,上次使用软件时间
     */
    @TableField(value = "last_time")
    private String last_time;

    /**
     * 一句话概括自己
     */
    @TableField(value = "my_link_info")
    private String my_link_info;

    /**
     * 0:未删除，1删除
     */
    @TableField(value = "is_del")
    private Integer is_del;

    /**
     * 创建人
     */
    @TableField(value = "created_by")
    private String created_by;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private String created_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
