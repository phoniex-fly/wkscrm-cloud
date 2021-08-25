package com.wkscrm.modules.monitor;

import com.yomahub.tlog.core.enhance.AspectLogEnhance;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 监控中心
 *
 * @author
 */
@EnableAdminServer
@SpringBootApplication
public class ServerMonitorApplication {
    static {AspectLogEnhance.enhance();}//进行日志增强，自动判断日志框架
    public static void main(String[] args) {
        SpringApplication.run(ServerMonitorApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  监控中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-----------------------------.\n" +
                " |                             |    \n" +
                " |                             |    \n" +
                " |                             |    \n" +
                " |        监控中心启动成功        |    \n" +
                " |                             |    \n" +
                " |                             |    \n" +
                " |                             |    \n" +
                " |                             |    \n" +
                " .-----------------------------.    ");
    }
}
