package com.wwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @RequestMapping(value = "/dept/add")
    public String add() {
        return "添加成功";
    }


    @RequestMapping(value = "/dept/get")
    public String get(){
        return "deptname";
    }

    @RequestMapping(value = "/dept/list")
    public String list(){
        return "dept list";
    }

}
