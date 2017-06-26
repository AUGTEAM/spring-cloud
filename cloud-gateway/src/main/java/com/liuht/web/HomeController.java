package com.liuht.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc <p></p>
 * Package com.liuht.web
 * Created by 刘惠涛 on 2017/5/11.
 */
@RestController
public class HomeController {
    @RequestMapping("/index")
    public Object index() {
        return "index";
    }

    @RequestMapping("/home")
    public Object home() {
        return "home";
    }
}
