package com.wkscrm.system.api.factory;

import com.wkscrm.common.core.domain.R;
import com.wkscrm.system.api.FileFeign;
import com.wkscrm.system.api.domain.SysFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件服务降级处理
 *
 * @author
 */
@Component
public class FileFeignFallbackFactory implements FallbackFactory<FileFeign> {
    private static final Logger log = LoggerFactory.getLogger(FileFeignFallbackFactory.class);

    @Override
    public FileFeign create(Throwable throwable) {
        log.error("文件服务调用失败:{}" , throwable.getMessage());
        return new FileFeign() {
            @Override
            public R<SysFile> upload(MultipartFile file) {
                return R.fail("上传文件失败:" + throwable.getMessage());
            }
        };
    }
}
