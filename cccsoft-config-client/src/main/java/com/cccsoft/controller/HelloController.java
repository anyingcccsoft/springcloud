package com.cccsoft.controller;/**
 * create with com.cccsoft.controller
 * Author ： zhangshun
 * Date ：2019/6/2510:39
 * TODO:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Package com.cccsoft.controller
 * @Author zsh11965
 * @Time 2019/6/2510:39
 */
@RestController
public class HelloController{

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from(){
        return this.hello;
    }
}
