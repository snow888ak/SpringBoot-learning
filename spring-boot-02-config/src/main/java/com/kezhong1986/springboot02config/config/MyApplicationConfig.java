package com.kezhong1986.springboot02config.config;

import com.kezhong1986.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/20 0:14
 */
@Configuration
public class MyApplicationConfig {

    @Bean
    public HelloService helloService2() {

        return new HelloService();
    }

}
