package com.wkscrm.collection;

import com.wkscrm.common.security.annotation.EnableCustomConfig;
import com.wkscrm.common.security.annotation.EnableWkscrmFeignClients;
import com.wkscrm.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCustomConfig
@EnableCustomSwagger2
@EnableWkscrmFeignClients
@SpringBootApplication
public class ServiceDataCollectionApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDataCollectionApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  数据采集模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .------------------------------.    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |        数据采集模块启动成功      |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " .------------------------------.   ");
    }
}
