package com.wwt.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value="PROVIDER-DEPT")
public interface DeptClientService {

    @RequestMapping(value = "/dept/add")
    String add();

    @RequestMapping(value = "/dept/get")
    String get();

    @RequestMapping(value = "/dept/list")
    String list();

}
