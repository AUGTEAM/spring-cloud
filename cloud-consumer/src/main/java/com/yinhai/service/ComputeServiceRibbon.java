package com.yinhai.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Desc <p></p>
 * Package com.yinhai.service
 * Created by 刘惠涛 on 2017/5/8.
 */
@Service
public class ComputeServiceRibbon {

    private final RestTemplate restTemplate;

    @Autowired
    public ComputeServiceRibbon(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        return restTemplate.getForEntity("http://compute-service-provider/add?a=10&b=20", String.class).getBody();
    }
    public String addServiceFallback() {
        return "error";
    }
}
