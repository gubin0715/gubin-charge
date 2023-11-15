package com.gubin.common.core.exception;

import com.gubin.common.core.enums.BusinessEnum;

/**
 * 自定义业务异常
 *
 * @author GuBin
 */
public class BusinessException extends RuntimeException {

    private final Integer code;

    public BusinessException(BusinessEnum error) {
        super(error.getMessage());
        this.code = error.getCode();
    }

    public Integer getCode() {
        return code;
    }
}

