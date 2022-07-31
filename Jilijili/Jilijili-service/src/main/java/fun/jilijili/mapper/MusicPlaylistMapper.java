package fun.jilijili.mapper;

import fun.jilijili.domain.MusicPlaylist;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author admin
* @description 针对表【music_playlist(音乐歌单)】的数据库操作Mapper
* @createDate 2022-07-31 15:41:53
* @Entity domain.domain.MusicPlaylist
*/
@Mapper
public interface MusicPlaylistMapper extends BaseMapper<MusicPlaylist> {

}




