package com.wkscrm.system.api.factory;

import com.wkscrm.common.core.domain.R;
import com.wkscrm.system.api.UserFeign;
import com.wkscrm.system.api.model.LoginUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 用户服务降级处理
 *
 * @author
 */
@Component
public class UserFeignFallbackFactory implements FallbackFactory<UserFeign> {
    private static final Logger log = LoggerFactory.getLogger(UserFeignFallbackFactory.class);

    @Override
    public UserFeign create(Throwable throwable) {
        log.error("用户服务调用失败:{}" , throwable.getMessage());
        return new UserFeign() {
            @Override
            public R<LoginUser> getUserInfo(String username) {
                return R.fail("获取用户失败:" + throwable.getMessage());
            }
        };
    }
}
