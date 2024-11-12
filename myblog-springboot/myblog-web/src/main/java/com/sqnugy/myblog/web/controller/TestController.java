package com.sqnugy.myblog.web.controller;

import com.sqnugy.myblog.common.enums.ResponseCodeEnum;
import com.sqnugy.myblog.common.exception.BizException;
import com.sqnugy.myblog.common.utils.JsonUtil;
import com.sqnugy.myblog.common.utils.Response;
import com.sqnugy.myblog.web.model.User;
import com.sqnugy.myblog.common.aspect.ApiOperationLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Collectors;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName TestController
 * @description TODO
 * @date 2024-11-04
 */

@RestController
@Slf4j
@Api(tags = "首页模块")
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    @ApiOperation(value = "测试接口")
    public Response test(@RequestBody @Validated User user) {
        // 打印入参
        log.info(JsonUtil.toJsonString(user));

        // 设置三种日期字段值
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateDate(LocalDate.now());
        user.setTime(LocalTime.now());

        return Response.success(user);
    }




}
