package com.liuht.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc <p></p>
 * Package com.liuht.web
 * Created by 刘惠涛 on 2017/5/9.
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;


    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
}
