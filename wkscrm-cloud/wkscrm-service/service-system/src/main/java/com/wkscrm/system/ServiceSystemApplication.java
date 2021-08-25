package com.wkscrm.system;

import com.wkscrm.common.security.annotation.EnableCustomConfig;
import com.wkscrm.common.security.annotation.EnableWkscrmFeignClients;
import com.wkscrm.common.swagger.annotation.EnableCustomSwagger2;
import com.yomahub.tlog.core.enhance.AspectLogEnhance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统模块
 *
 * @author
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableWkscrmFeignClients
@SpringBootApplication
public class ServiceSystemApplication {
    static {AspectLogEnhance.enhance();}//进行日志增强，自动判断日志框架
    public static void main(String[] args) {
        SpringApplication.run(ServiceSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .------------------------------.    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |        系统模块启动成功      |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " |                              |    \n" +
                " .------------------------------.   ");
    }
}
