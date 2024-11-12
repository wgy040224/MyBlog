package com.sqnugy.myblog.common.aspect;

import java.lang.annotation.*;

import java.lang.annotation.*;

/**
 * @author sqnugy
 * @version 1.0
 * @InterfaceName ApiOperationLog
 * @description
 * @date 2024-11-04
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";
}
