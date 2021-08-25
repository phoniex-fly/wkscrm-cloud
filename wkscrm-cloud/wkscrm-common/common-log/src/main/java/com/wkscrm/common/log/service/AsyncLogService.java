package com.wkscrm.common.log.service;

import com.wkscrm.system.api.LogFeign;
import com.wkscrm.system.api.domain.SysOperLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步调用日志服务
 *
 * @author
 */
@Service
public class AsyncLogService {

    @Autowired
    private LogFeign logFeign;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveSysLog(SysOperLog sysOperLog) {
        logFeign.saveLog(sysOperLog);
    }
}
