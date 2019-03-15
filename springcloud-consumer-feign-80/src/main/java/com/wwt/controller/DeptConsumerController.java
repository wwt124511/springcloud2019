package com.wwt.controller;


import com.wwt.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/feign/dept/add")
    public String add()
    {
        return deptClientService.add();
    }

    @RequestMapping(value = "/feign/dept/get")
    public String get()
    {
        return deptClientService.get();
    }

    @RequestMapping(value = "/feign/dept/list")
    public String list()
    {
        return deptClientService.list();
    }

}
