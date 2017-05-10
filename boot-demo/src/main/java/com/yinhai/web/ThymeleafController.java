package com.yinhai.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc <p></p>
 * Package com.yinhai.web
 * Created by 刘惠涛 on 2017/5/5.
 */
@Controller
public class ThymeleafController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://www.yinhai.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
