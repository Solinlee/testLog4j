package cn.solin.testLog4j2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TestLog4jApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestLog4jApplication.class);
        log.info("TestLog4jApplication项目启动了");
    }
}
