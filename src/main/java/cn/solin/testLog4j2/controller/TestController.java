package cn.solin.testLog4j2.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test")
    public String test() {
        log.info("test:info接收到请求了");
        log.warn("test:warn接收到请求了");
        log.error("test:error接收到请求了");
        return "aaa";
    }
}
