package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class rest {

    @RequestMapping("/test")
    public String test() {
        System.out.println("test");
        return "daniel";
    }
}
