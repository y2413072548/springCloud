package com.yy.springcloud.controller;

import com.yy.springcloud.Service.PaymentService;
import com.yy.springcloud.pojo.CommonResult;
import com.yy.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private PaymentService paymentService;
    @RequestMapping("/test/{id}")
    public CommonResult payment(@PathVariable String id){
        Payment payment = paymentService.get(id);
        return new CommonResult<Payment>(200,"OJBK"+serverPort+payment);
    }
}
