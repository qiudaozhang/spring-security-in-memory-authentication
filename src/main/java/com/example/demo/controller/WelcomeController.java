package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 邱道长
 * 2020/12/30
 */
@Controller
public class WelcomeController {

    @GetMapping("welcome")
    public String login() {
        System.out.println("welcome page ...");
        return "welcome";
    }
}
