package com.wkscrm.report;

import com.wkscrm.common.security.annotation.EnableCustomConfig;
import com.wkscrm.common.security.annotation.EnableWkscrmFeignClients;
import com.wkscrm.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCustomConfig
@EnableCustomSwagger2
@EnableWkscrmFeignClients
@SpringBootApplication
public class ServiceReportApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceReportApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  报表模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .------------------------------.    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |          报表模块启动成功       |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " .------------------------------.   ");
    }
}
