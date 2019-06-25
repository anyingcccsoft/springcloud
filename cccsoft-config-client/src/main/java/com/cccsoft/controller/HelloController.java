package com.cccsoft.controller;/**
 * create with com.cccsoft.controller
 * Author ： zhangshun
 * Date ：2019/6/2510:39
 * TODO:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Package com.cccsoft.controller
 * @Author zsh11965
 * @Time 2019/6/2510:39
 * @RefreshScope 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
 */
@RestController
@RefreshScope
public class HelloController{

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from(){
        return this.hello;
    }
}
