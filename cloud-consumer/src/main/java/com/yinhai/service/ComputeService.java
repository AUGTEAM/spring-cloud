package com.yinhai.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Desc <p>绑定compute-service-provider服务</p>
 * Package com.yinhai.service
 * Created by 刘惠涛 on 2017/5/8.
 */
@FeignClient(value = "compute-service-provider", fallback = ComputeClientHystrix.class)
public interface ComputeService {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
