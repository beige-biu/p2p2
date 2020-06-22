package com.wenyu.p2p.controller.user;

import com.wenyu.p2p.model.User;
import com.wenyu.p2p.service.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:wenyu
 * 2020/6/11
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;
    @RequestMapping("/user/login")
    public Object login(User user){
        user = userService.login(user);

        return user;
    }

}
