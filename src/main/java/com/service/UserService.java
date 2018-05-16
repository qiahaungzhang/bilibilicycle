package com.service;

import com.entity.User;

import java.util.Map;


public interface UserService {
    User queryByUserName(Map<String, Object> map);
}
