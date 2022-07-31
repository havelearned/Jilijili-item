package fun.jilijili.service;

import fun.jilijili.common.config.feign.FeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WY-RPC", url = "https://music-api-wine-kappa.vercel.app", configuration = FeignServiceConfig.class)
public interface WYFeignService {


    /**
     * 游客登陆
     * */
    @GetMapping(value = "/register/anonimous")
    String anonimous();
}
