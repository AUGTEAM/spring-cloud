package com.liuht.service;

import org.springframework.stereotype.Component;

/**
 * Desc <p>Feign中使用Hystrix断路器</p>
 * Package com.liuht.service
 * Created by 刘惠涛 on 2017/5/8.
 */
@Component
public class ComputeClientHystrix implements ComputeService{

    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
