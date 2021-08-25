package com.wkscrm.auth;

import com.wkscrm.common.security.annotation.EnableWkscrmFeignClients;
import com.yomahub.tlog.core.enhance.AspectLogEnhance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 认证授权中心
 *
 * @author
 */
@EnableWkscrmFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServerAuthApplication {

    static {AspectLogEnhance.enhance();}//进行日志增强，自动判断日志框架

    public static void main(String[] args) {
        SpringApplication.run(ServerAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .--------------------------.       \n" +
                " |                          |       \n" +
                " |                          |       \n" +
                " |          wkcsrm          |       \n" +
                " |      认证授权中心启动成功    |       \n" +
                " |                          |       \n" +
                " |                          |       \n" +
                " |                          |       \n" +
                " .--------------------------.       ");
    }
}
