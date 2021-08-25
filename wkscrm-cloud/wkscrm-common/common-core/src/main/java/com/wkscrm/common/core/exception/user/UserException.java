package com.wkscrm.common.core.exception.user;

import com.wkscrm.common.core.exception.BaseException;

/**
 * 用户信息异常类
 *
 * @author wkscrm
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user" , code, args, null);
    }
}
