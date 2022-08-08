package com.zyz.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyizhang
 * @description：
 * 只要当前静态资源放在类路径下： /static(or /public or /resources or /META-INF/resources )
 * 访问：当前项目类路径 / + 静态资源名
 *
 * 原理： 静态映射 /**
 * 请求进来。先去找Controller 看能不能处理，不能出理的所有请求又都交给了静态资源管理器，静态资源也找不到，则404
 *
 *
 *
 * 静态资源访问前缀
 *  默认无前缀
 *  在yaml文件中配置
 *  spring:
 *   mvc:
 *     static-path-pattern: /res/**
 *     则当前项目+static-path-pattern +静态资源名 = 静态资源文件下找
 * @create 2022-08-08 10:48
 */

@RestController
public class HellorController {

    @RequestMapping("/张张张.jpg")
    public String hello(){
        return "adadad";
    }
}
