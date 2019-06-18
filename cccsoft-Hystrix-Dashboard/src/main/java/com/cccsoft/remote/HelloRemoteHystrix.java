package com.cccsoft.remote;/**
 * create with com.cccsoft.remote
 * Author ： zhangshun
 * Date ：2019/6/1416:08
 * TODO:
 */

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description :
 * @Package com.cccsoft.remote
 * @Author zsh11965
 * @Time 2019/6/1416:08
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String sayHello2(@RequestParam(value = "name") String name){
        return "hello"+name+"this is a Hystrix test";
    }
}
