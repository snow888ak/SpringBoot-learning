package com.kezhong1986.springboot02profile.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/22 0:26
 */
@RestController
open class HelloController {

    @Value("\${server-name}")
    lateinit var serverName: String

    @RequestMapping("hello")
    fun hello(): String {

        return "Hello $serverName!"
    }

}