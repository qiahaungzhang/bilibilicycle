package com.service.impl;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserService userService;
    @Override
    public User queryByUserName(Map<String, Object> map) {
        return userService.queryByUserName(map);
    }
}
