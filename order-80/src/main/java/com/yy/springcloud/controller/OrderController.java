package com.yy.springcloud.controller;

import com.yy.springcloud.pojo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    public static final String INVOKE_URL = "http://cloud-payment";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/test/{id}")
    public CommonResult payment(@PathVariable String id){
        return restTemplate.getForObject(INVOKE_URL + "/test/" + id,CommonResult.class);
    }
}
