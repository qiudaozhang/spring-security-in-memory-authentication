package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 邱道长
 * 2020/12/29
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
