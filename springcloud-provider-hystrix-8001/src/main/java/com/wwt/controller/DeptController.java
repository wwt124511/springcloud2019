package com.wwt.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wwt.entity.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @RequestMapping(value = "/dept/add")
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrixMethod")
    public String add() {
        System.out.println("8001-hystrix-/dept/add");
        int ii = 1/0;
        return "添加成功";
    }


    @RequestMapping(value = "/dept/get")
    public String get(){
        System.out.println("8001-hystrix-/dept/get");
        return "deptname";
    }

    @RequestMapping(value = "/dept/list")
    public String list(){
        System.out.println("8001-hystrix-/dept/list");
        return "dept list";
    }

    public String processHystrixMethod()
    {
        return "处理失败";
    }

}
