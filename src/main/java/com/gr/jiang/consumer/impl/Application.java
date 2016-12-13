package com.gr.jiang.consumer.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by jiang on 2016/12/12.
 */

@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
public class Application {
    public static void main(String [] args){
        SpringApplication.run(Application.class,args);
    }
}
