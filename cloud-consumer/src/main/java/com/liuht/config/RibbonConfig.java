package com.liuht.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Desc <p></p>
 * Package com.liuht.config
 * Created by 刘惠涛 on 2017/5/11.
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 配置负载均衡策略为随机,默认是轮询
     * @return 负载均衡策略
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
