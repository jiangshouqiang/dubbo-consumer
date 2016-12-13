package com.gr.jiang.consumer.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gr.jiang.mod.hello.UserService;

/**
 * Created by jiang on 2016/12/12.
 */
@RestController
public class userTest {
    @Reference
    private UserService demoService ;

    @RequestMapping("/greeting")
    public String greeting(String name){

        return demoService.sayHello(name);
    }
}
