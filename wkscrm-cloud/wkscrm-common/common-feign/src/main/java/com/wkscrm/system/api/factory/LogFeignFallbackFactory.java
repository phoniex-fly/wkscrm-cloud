package com.wkscrm.system.api.factory;

import com.wkscrm.common.core.domain.R;
import com.wkscrm.system.api.LogFeign;
import com.wkscrm.system.api.domain.SysOperLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 日志服务降级处理
 *
 * @author
 */
@Component
public class LogFeignFallbackFactory implements FallbackFactory<LogFeign> {
    private static final Logger log = LoggerFactory.getLogger(LogFeignFallbackFactory.class);

    @Override
    public LogFeign create(Throwable throwable) {
        log.error("日志服务调用失败:{}" , throwable.getMessage());
        return new LogFeign() {
            @Override
            public R<Boolean> saveLog(SysOperLog sysOperLog) {
                return null;
            }

            @Override
            public R<Boolean> saveLogininfor(String username, String status, String message) {
                return null;
            }
        };

    }
}
