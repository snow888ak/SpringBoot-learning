package com.kezhong1986.pojo

import javax.print.attribute.IntegerSyntax

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/23 22:13
 */
class User {

    constructor(name: String?, age: Int?) {
        userName = name
        this@User.age = age
    }

    var userName: String? = null
    var age: Int? = null
}
