package fun.jilijili.domain.wy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Anonimous {
    private int code;
    private long userId;
    private long createTime;
    private String cookie;
}
