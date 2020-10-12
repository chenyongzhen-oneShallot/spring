package com.alibaba.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
    @RequestMapping("/index")
    public String index(){
        return "hello world";
    }
}
