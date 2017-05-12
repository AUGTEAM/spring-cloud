package com.yinhai.config;

import com.netflix.turbine.streaming.servlet.TurbineStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Desc <p></p>
 * Package com.yinhai.config
 * Created by 刘惠涛 on 2017/5/12.
 */
@Configuration
public class TurbineConfig {
    // 注入 turbine servlet
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new TurbineStreamServlet(), "/turbine.stream");
    }
}
