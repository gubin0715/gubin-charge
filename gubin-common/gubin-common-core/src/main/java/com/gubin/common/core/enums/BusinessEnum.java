package com.gubin.common.core.enums;

/**
 * 自定义业务异常信息
 *
 * @author GuBin
 */
public enum BusinessEnum {

    LOGIN_USER_NOT_EXIST(10000, "用户不存在"),
    ;

    private final Integer code;
    private final String message;

    BusinessEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
