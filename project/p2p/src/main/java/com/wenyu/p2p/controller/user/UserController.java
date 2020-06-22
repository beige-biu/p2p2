package com.wenyu.p2p.controller.user;

import com.wenyu.p2p.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Author:wenyu
 * 2020/6/11
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;
    @RequestMapping("/user/login")
    private String login(@RequestParam Map requestParams, Model model, HttpSession session){

        Map result = userService.login(requestParams);
        if(result==null){
            model.addAttribute("errMessage", "账户密码错误");
            return "login";
        }
        session.setAttribute("userSession",result);
        return "index";
    }
}
