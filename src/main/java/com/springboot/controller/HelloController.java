package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangyu on 2017/1/19.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Value("${application.hello}")
    private String str;

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","yangyu");
        model.addAttribute("str",str);
        return "hello";
    }
}
