package com.wwt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptConsumerController {

    //通过Ribbon方式访问，从eureka注册中心获取服务
    private static final String REST_URL_PREFIX = "http://PROVIDER-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon/dept/add")
    public String add()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/add", String.class);
    }

    @RequestMapping(value = "/ribbon/dept/get")
    public String get()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/", String.class);
    }

    @RequestMapping(value = "/ribbon/dept/list")
    public String list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", String.class);
    }

}
