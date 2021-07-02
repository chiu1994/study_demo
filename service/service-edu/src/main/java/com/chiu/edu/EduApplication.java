package com.chiu.edu;/**
 * Licensed to CMIM,Inc. under the terms of the CMIM
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date                  Author               Version        Comments
 * 2021/7/2             chaoxiang.qiu        1.0            Initial Version
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chiu
 * @date 2021年07月02日 13:34
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.chiu"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class, args);
    }
}
