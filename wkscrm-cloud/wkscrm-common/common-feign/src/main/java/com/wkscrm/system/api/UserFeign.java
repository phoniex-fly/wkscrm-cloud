package com.wkscrm.system.api;

import com.wkscrm.common.core.constant.ServiceNameConstants;
import com.wkscrm.common.core.domain.R;
import com.wkscrm.system.api.factory.UserFeignFallbackFactory;
import com.wkscrm.system.api.model.LoginUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 用户服务
 *
 * @author
 */
@FeignClient(contextId = "userFeign" , value = ServiceNameConstants.SYSTEM_SERVICE, fallbackFactory = UserFeignFallbackFactory.class)
public interface UserFeign {
    /**
     * 通过用户名查询用户信息
     *
     * @param username 用户名
     * @return 结果
     */
    @GetMapping(value = "/user/info/{username}")
    public R<LoginUser> getUserInfo(@PathVariable("username") String username);
}
