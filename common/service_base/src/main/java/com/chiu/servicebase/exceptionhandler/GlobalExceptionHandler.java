package com.chiu.servicebase.exceptionhandler;/**
 * Licensed to CMIM,Inc. under the terms of the CMIM
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date                  Author               Version        Comments
 * 2021/7/2             chaoxiang.qiu        1.0            Initial Version
 **/


import com.chiu.commonutils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chiu
 * @date 2021年07月02日 16:37
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    // 指定出现什么异常执行这个方法
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        e.printStackTrace();
        List<String> list = new ArrayList<>();
        list.stream().filter()
        return R.error().message("执行了全局异常处理...");
    }
}
