package com.kezhong1986.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/24 22:18
 */
@Controller
class IndexController {

    @RequestMapping(value = ["/", "/index.html", "/index"], method = [RequestMethod.GET])
    fun index(): String {

        return "login"
    }

}