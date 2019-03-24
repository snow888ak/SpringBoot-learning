package com.kezhong1986.controller

import com.kezhong1986.pojo.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/22 23:11
 */
@Controller
class HelloController {

    @ResponseBody
    @RequestMapping("hello")
    fun hello() : String = "Hello World!"

    @RequestMapping("/success")
    fun success(map: MutableMap<String, Any>): String {
        map["hello"] = "张三"
        map["books"] = listOf("java", "python", "kotlin")
        map["user"] = User("张三", 28)
        return "success"
    }

}