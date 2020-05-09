package com.jinjue.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public String add( @RequestParam("username") long username) {
        return "xiaoming";
    }
}