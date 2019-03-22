package com.kezhong1986.springboot03logger

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/22 22:27
 */
@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest
class SpringBoot03LoggerApplicationTest {

    val logger: Logger = LoggerFactory.getLogger(SpringBoot03LoggerApplication::class.java)

    @Test
    fun loggerInfo() {
        //  日志级别：trace<debug<info<warn<error，默认为info
        logger.trace("这是trace日志")
        logger.debug("这是debug日志")
        logger.info("这是info日志")//默认为root级别，
        logger.warn("这是warn日志")
        logger.error("这是error日志")
    }

}