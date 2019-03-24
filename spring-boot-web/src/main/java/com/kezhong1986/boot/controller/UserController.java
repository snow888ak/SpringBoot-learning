package com.kezhong1986.boot.controller;

import com.kezhong1986.boot.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/14 0:37
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public User getUser() {

        User user = new User();

        user.setName("小明");
        user.setPassword("xxxx");

        return user;
    }

}
