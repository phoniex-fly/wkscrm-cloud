package com.wkscrm.job;

import com.wkscrm.common.security.annotation.EnableCustomConfig;
import com.wkscrm.common.security.annotation.EnableWkscrmFeignClients;
import com.wkscrm.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 定时任务
 *
 * @author
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableWkscrmFeignClients
@SpringBootApplication
public class ServiceJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .------------------------------.    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |        定时任务模块启动成功      |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " .------------------------------.   ");
    }
}
