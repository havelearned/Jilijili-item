package fun.jilijili.common.config.mpconfig;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//自动填充
@Slf4j
@Component
public class MyBatisHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        boolean b = metaObject.hasSetter("createdTime");
        if (b) {
            log.info("自动填充插入时间------------>");
            this.strictInsertFill(metaObject, "createdTime", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐使用)
        } else {
            log.error("没有字段:createdTime 无法自动填充");
        }
    }
    @Override
    public void updateFill(MetaObject metaObject) {
        boolean b = metaObject.hasSetter("updatedTime");
        if (b) {
            log.info("自动填充更新时间------------>");
            this.strictUpdateFill(metaObject, "updatedTime", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐)
        } else {
            log.error("没有字段:createdTime 无法自动填充");
        }
    }
}

