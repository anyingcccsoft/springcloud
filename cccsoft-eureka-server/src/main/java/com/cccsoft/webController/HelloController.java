package com.cccsoft.webController;/**
 * create with com.cccsoft.webController
 * Author ： zhangshun
 * Date ：2019/6/1017:45
 * TODO:
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Package com.cccsoft.webController
 * @Author zsh11965
 * @Time 2019/6/1017:45
 */
@RestController
public class HelloController{

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name){
        return "hello"+name;
    }
}
