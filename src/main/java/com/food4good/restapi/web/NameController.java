package com.food4good.restapi.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @RequestMapping("/api/hello")

    public String helloName(@RequestParam(value = "name") String name){
        return "Hello "+name;
    }
}
