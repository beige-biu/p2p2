package com.wenyu.p2p.service.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Author:wenyu
 * 2020/6/11
 */
@FeignClient(name = "P2PSERVICE")

public interface UserService {

    @RequestMapping("/user/login")
    public Map login(@RequestParam Map requestMap);
}
