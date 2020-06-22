package com.wenyu.p2p.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:wenyu
 * 2020/6/10
 */
@Controller
public class BaseController {

    @RequestMapping("/")
    private String index(){
        return "index";
    }

    @RequestMapping("/login")
    private String login(){
        return "login";
    }
}
