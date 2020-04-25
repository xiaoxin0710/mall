package com.yunyang.mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dzy
 * @version 1.0
 * @date 2020/4/18 21:29
 */

@RestController
public class LoginController {
    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }
    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin!";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "hello user!";
    }
    @GetMapping("/db/hello")
    public String dba(){
        return "hello dba!";
    }
}
