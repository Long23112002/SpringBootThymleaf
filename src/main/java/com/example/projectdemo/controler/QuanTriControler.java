package com.example.projectdemo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuanTriControler {
    @GetMapping("/admin")
    public String admin(){
        return "admin/index";
    }
}
