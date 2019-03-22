package com.kezhong1986.springboot03logger

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBoot03LoggerApplication

fun main(args: Array<String>) {
    runApplication<SpringBoot03LoggerApplication>(*args)
}
