package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 邱道长
 * 2020/12/30
 */
@Controller
public class LoginController {

    @GetMapping("login")
    public String login() {
        System.out.println("login page ...");
        return "login";
    }
}
