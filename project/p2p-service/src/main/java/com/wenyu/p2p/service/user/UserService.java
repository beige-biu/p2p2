package com.wenyu.p2p.service.user;

import com.wenyu.p2p.model.User;
import org.springframework.stereotype.Service;

/**
 * Author:wenyu
 * 2020/6/12
 */

public interface UserService {
    User login(User user);
}
