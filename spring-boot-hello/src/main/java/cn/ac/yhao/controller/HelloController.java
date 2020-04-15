package cn.ac.yhao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "spring boot 2.X !";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot 2.X !";
    }
}
