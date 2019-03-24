package com.kezhong1986.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/14 0:21
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {

        return "hello world!";
    }

}
