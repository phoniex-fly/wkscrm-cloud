package com.wkscrm.gen;

import com.wkscrm.common.security.annotation.EnableCustomConfig;
import com.wkscrm.common.security.annotation.EnableWkscrmFeignClients;
import com.wkscrm.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成
 *
 * @author
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableWkscrmFeignClients
@SpringBootApplication
public class ServiceGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .------------------------------.    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |        代码生成模块启动成功      |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " .------------------------------.   ");
    }
}
