package cn.bilibilicycle.dao;


import cn.bilibilicycle.entity.User;
import org.apache.ibatis.annotations.Mapper;

import javax.jws.soap.SOAPBinding;
import java.util.Map;

@Mapper
public interface UserDao {
    int queryUserByUserName(Map<String, Object> map);

    int saveUserInfo(User user);

}
