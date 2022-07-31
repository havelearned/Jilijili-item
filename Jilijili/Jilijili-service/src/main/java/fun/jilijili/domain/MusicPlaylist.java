package fun.jilijili.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 音乐歌单
 * @TableName music_playlist
 */
@TableName(value ="music_playlist")
@Data
public class MusicPlaylist implements Serializable {
    /**
     * 唯一id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 歌单名称
     */
    @TableField(value = "playlist_name")
    private String playlist_name;

    /**
     * 外部链接
     */
    @TableField(value = "join_link")
    private String join_link;

    /**
     * 用户id,用户下的歌单
     */
    @TableField(value = "user_id")
    private String user_id;

    /**
     * 播放次数
     */
    @TableField(value = "play_count")
    private Integer play_count;

    /**
     * 歌单类型,暂时没有想到
     */
    @TableField(value = "type")
    private Integer type;

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

    /**
     * 是否删除
     */
    @TableField(value = "is_del")
    private Integer is_del;

    /**
     * 更新人
     */
    @TableField(value = "updated_by")
    private String updated_by;

    /**
     * 更新时间
     */
    @TableField(value = "updated_time")
    private String updated_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
