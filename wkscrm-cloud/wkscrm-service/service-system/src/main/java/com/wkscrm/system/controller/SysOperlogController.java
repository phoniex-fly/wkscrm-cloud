package com.wkscrm.system.controller;

import com.wkscrm.common.core.utils.poi.ExcelUtil;
import com.wkscrm.common.core.web.controller.BaseController;
import com.wkscrm.common.core.web.domain.AjaxResult;
import com.wkscrm.common.core.web.page.TableDataInfo;
import com.wkscrm.common.log.annotation.Log;
import com.wkscrm.common.log.enums.BusinessType;
import com.wkscrm.common.security.annotation.PreAuthorize;
import com.wkscrm.system.api.domain.SysOperLog;
import com.wkscrm.system.service.ISysOperLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 操作日志记录
 *
 * @author
 */
@RestController
@RequestMapping("/operlog")
public class SysOperlogController extends BaseController {
    @Autowired
    private ISysOperLogService operLogService;

    @PreAuthorize(hasPermi = "system:operlog:list")
    @GetMapping("/list")
    public TableDataInfo list(SysOperLog operLog) {
        startPage();
        List<SysOperLog> list = operLogService.selectOperLogList(operLog);
        return getDataTable(list);
    }

    @Log(title = "操作日志" , businessType = BusinessType.EXPORT)
    @PreAuthorize(hasPermi = "system:operlog:export")
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysOperLog operLog) throws IOException {
        List<SysOperLog> list = operLogService.selectOperLogList(operLog);
        ExcelUtil<SysOperLog> util = new ExcelUtil<SysOperLog>(SysOperLog.class);
        util.exportExcel(response, list, "操作日志");
    }

    @Log(title = "操作日志" , businessType = BusinessType.DELETE)
    @PreAuthorize(hasPermi = "system:operlog:remove")
    @DeleteMapping("/{operIds}")
    public AjaxResult remove(@PathVariable Long[] operIds) {
        return toAjax(operLogService.deleteOperLogByIds(operIds));
    }

    @PreAuthorize(hasPermi = "system:operlog:remove")
    @Log(title = "操作日志" , businessType = BusinessType.CLEAN)
    @DeleteMapping("/clean")
    public AjaxResult clean() {
        operLogService.cleanOperLog();
        return AjaxResult.success();
    }

    @PostMapping
    public AjaxResult add(@RequestBody SysOperLog operLog) {
        return toAjax(operLogService.insertOperlog(operLog));
    }
}
