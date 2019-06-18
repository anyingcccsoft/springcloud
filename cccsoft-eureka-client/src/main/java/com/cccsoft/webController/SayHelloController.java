package com.cccsoft.webController;/**
 * create with com.cccsoft.webController
 * Author ： zhangshun
 * Date ：2019/6/1017:10
 * TODO:
 */

import com.cccsoft.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Package com.cccsoft.webController
 * @Author zsh11965
 * @Time 2019/6/1017:10
 */
@RestController
public class SayHelloController{

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable(value = "name") String name){
        return helloRemote.sayHello(name);
    }

}
