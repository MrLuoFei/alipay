package com.atguigu.spring.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderZkController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL="http://cloud-provider-payment";

    @GetMapping(value = "/consumer/payment/zk")
    public String payment(){
        String result = restTemplate.getForObject(PAYMENT_URL + "/payment/zk/", String.class);
        return  result;
    }
}
