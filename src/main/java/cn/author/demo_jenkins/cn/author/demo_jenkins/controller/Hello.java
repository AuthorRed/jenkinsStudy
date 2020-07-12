package cn.author.demo_jenkins.cn.author.demo_jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("hello")
    public String hello(String name){
        return "nice to meet you "+name;
    }
}
