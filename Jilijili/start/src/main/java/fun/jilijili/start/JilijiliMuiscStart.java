package fun.jilijili.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
@EnableFeignClients(value = "fun.jilijili.service")
@ComponentScan(value = {
        "fun.jilijili.common.config",
        "fun.jilijili.mapper",
        "fun.jilijili.service",
        "fun.jilijili.api"})
public class JilijiliMuiscStart {
    public static void main(String[] args) {
        SpringApplication.run(JilijiliMuiscStart.class, args);
    }
}
