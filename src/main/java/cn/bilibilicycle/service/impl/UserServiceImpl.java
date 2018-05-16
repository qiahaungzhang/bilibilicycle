package cn.bilibilicycle.service.impl;

import cn.bilibilicycle.service.UserService;
import cn.bilibilicycle.dao.UserDao;
import cn.bilibilicycle.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int queryByUserName(Map<String,Object> map) {
        return userDao.queryUserByUserName(map);
    }
}
