package com.kezhong1986.boot;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/14 0:44
 */
@Configuration
public class WebConfiguration {

    @Bean
    public RemoteIpFilter remoteIpFilter() {

        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();

        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);

        return registration;
    }

    public class MyFilter implements Filter {

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

            HttpServletRequest request = (HttpServletRequest) servletRequest;

            System.out.println("this is MyFilter, Url:" + request.getRequestURI());

            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

}
