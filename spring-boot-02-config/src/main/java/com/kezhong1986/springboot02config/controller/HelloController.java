package com.kezhong1986.springboot02config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/19 23:55
 */
@RestController
public class HelloController {

    //使用@Value注解获取配置文件中配置的值
    @Value("${person.name}")
    private String name;
    @Value("#{10+5}")
    private Integer age;
    @Value("${user.name}")
    private String userName;

    @RequestMapping("hello")
    public String hello() {

        return "hello " + name + " : age=" + age;
    }

    @RequestMapping("hello2")
    public String hello2() {
        return "hello " + userName;
    }

}
