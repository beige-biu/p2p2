package com.wenyu.p2p.service.user.impl;

import com.wenyu.p2p.mapper.UserMapper;
import com.wenyu.p2p.model.User;
import com.wenyu.p2p.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Author:wenyu
 * 2020/6/12
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        User tmpUser = userMapper.selectByPhone(user.getPhone());
        //进入if表示手机号不存在或密码错误
        if(tmpUser==null||!tmpUser.getLoginPassword().equals(user.getLoginPassword())){
            return null;
        }
        userMapper.updateByLastLongTime(user.getId(),new Date());
        return  tmpUser;
    }
}
