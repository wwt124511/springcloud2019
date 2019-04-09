package com.wwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @RequestMapping(value = "/dept/add")
    public String add() {
        System.out.println("8002-/dept/add");
        return "添加成功";
    }


    @RequestMapping(value = "/dept/get")
    public String get(){
        System.out.println("8002-/dept/get");
        return "deptname";
    }

    @RequestMapping(value = "/dept/list")
    public String list(){
        System.out.println("8002-/dept/list");
        return "dept list";
    }

}
