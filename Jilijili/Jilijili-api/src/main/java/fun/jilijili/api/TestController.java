package fun.jilijili.api;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fun.jilijili.common.config.redis.RedisConf.RedisUtils;
import fun.jilijili.domain.MusicUser;
import fun.jilijili.domain.wy.Anonimous;
import fun.jilijili.service.MusicUserService;
import fun.jilijili.service.WYFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private RedisUtils redisUtils;

    @Resource
    private MusicUserService musicUserService;

    @Resource
    private WYFeignService myFeignService;


    @GetMapping(value = "/test2")
    public String testWY(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException {
        String json = myFeignService.anonimous();
        ObjectMapper objectMapper = new ObjectMapper();
        Anonimous anonimous = objectMapper.readValue(json, Anonimous.class);
        this.redisUtils.set("wy:login:anonimous",json);
        return anonimous.toString();

    }

    @GetMapping(value = "/test1")
    public String test(HttpServletRequest  request) throws JsonProcessingException {
        String strReq = request.toString();
        log.debug(strReq);
        redisUtils.set("tset",strReq);
        ObjectMapper objectMapper = new ObjectMapper();
        List<MusicUser> musicUsers = musicUserService.getBaseMapper().selectList(null);

        return objectMapper.writeValueAsString(musicUsers);
    }
}
