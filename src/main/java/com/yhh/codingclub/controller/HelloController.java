package com.yhh.codingclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Eason
 * @Date 2025-03-02 20:02
 * @PackageName:com.yhh.codingclub.controller
 * @ClassName: HelloController
 * @Description: TODO
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
