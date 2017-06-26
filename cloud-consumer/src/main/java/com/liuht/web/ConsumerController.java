package com.liuht.web;

import com.liuht.service.ComputeService;
import com.liuht.service.ComputeServiceRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc <p></p>
 * Package com.liuht.web
 * Created by 刘惠涛 on 2017/5/8.
 */
@RestController
public class ConsumerController {

    private final ComputeServiceRibbon serviceRibbon;

    @Autowired
    public ConsumerController(ComputeServiceRibbon serviceRibbon, ComputeService computeClient) {
        this.serviceRibbon = serviceRibbon;
        this.computeClient = computeClient;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return serviceRibbon.addService();
    }

    private final ComputeService computeClient;

    @RequestMapping(value = "/addF", method = RequestMethod.GET)
    public Integer addF() {
        return computeClient.add(10, 30);
    }
}
