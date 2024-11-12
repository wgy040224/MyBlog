package com.sqnugy.myblog.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName BizException
 * @description
 * @date 2024-11-11
 */

@Getter
@Setter
public class BizException extends RuntimeException {
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}
