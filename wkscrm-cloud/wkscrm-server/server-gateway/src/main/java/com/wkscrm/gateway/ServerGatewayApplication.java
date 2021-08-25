package com.wkscrm.gateway;

import com.wkscrm.common.security.annotation.EnableWkscrmFeignClients;
import com.yomahub.tlog.core.enhance.AspectLogEnhance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author
 */
@EnableWkscrmFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServerGatewayApplication {
    static {AspectLogEnhance.enhance();}//进行日志增强，自动判断日志框架

    public static void main(String[] args) {
        SpringApplication.run(ServerGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  网关启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .--------------------------------. \n" +
                " |                                | \n" +
                " |                                | \n" +
                " |                                | \n" +
                " |          网关启动成功            | \n" +
                " |                                | \n" +
                " |                                | \n" +
                " |                                | \n" +
                " |                                | \n" +
                " .--------------------------------. ");
    }
}
