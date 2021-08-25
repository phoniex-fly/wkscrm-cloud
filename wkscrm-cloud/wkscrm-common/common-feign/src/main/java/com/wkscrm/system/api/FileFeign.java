package com.wkscrm.system.api;

import com.wkscrm.common.core.constant.ServiceNameConstants;
import com.wkscrm.common.core.domain.R;
import com.wkscrm.system.api.domain.SysFile;
import com.wkscrm.system.api.factory.FileFeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件服务
 *
 * @author
 */
@FeignClient(contextId = "fileFeign" , value = ServiceNameConstants.FILE_SERVICE, fallbackFactory = FileFeignFallbackFactory.class)
public interface FileFeign {
    /**
     * 上传文件
     *
     * @param file 文件信息
     * @return 结果
     */
    @PostMapping(value = "/upload" , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public R<SysFile> upload(@RequestPart(value = "file") MultipartFile file);
}
