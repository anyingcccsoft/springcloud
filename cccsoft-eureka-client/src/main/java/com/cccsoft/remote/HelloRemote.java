package com.cccsoft.remote;/**
 * create with com.cccsoft.webController
 * Author ： zhangshun
 * Date ：2019/6/1213:38
 * TODO:
 */



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description :
 * @Package com.cccsoft.webController
 * @Author zsh11965
 * @Time 2019/6/1213:38
 */
@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote{

    @RequestMapping(value="/hello")
    public String sayHello(@RequestParam(value = "name") String name);
}
