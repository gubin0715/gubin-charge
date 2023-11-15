package com.gubin.common.log.annotation;

import java.lang.annotation.*;

/**
 * 自定义操作日志记录注解
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 方法英文名称
     */
    String key() default "";


    /**
     * 方法中文名称
     */
    String name();

    /**
     * 是否保存请求的参数
     */
    String description() default "";
}
