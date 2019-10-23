package com.example.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @Author gyf
 * @Date 2019/10/23 23:04
 */
@RestController
public class HelloController {
    @RequestMapping
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is producer 2  send first messge";
    }
}
