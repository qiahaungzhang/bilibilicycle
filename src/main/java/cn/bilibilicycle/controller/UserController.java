package cn.bilibilicycle.controller;

import cn.bilibilicycle.service.UserService;
import cn.bilibilicycle.common.R;
import cn.bilibilicycle.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/sys")
public class UserController {
    private Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public R login(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password){
        if(username.equals("")||password.equals("")){
            return R.error("用户名或密码不能为空");
        }
        Map<String,Object> map=new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        int result=userService.queryByUserName(map);
        if(result!=0){
            return R.ok();
        }

        return R.error("用户名或密码不正确");
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public R login(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password,@RequestParam(value = "school") String school,@RequestParam(value = "address") String address){
        if(username.equals("")||password.equals("")){
            return R.error("用户名或密码不能为空");
        }
        User user=new User();
        user.setId(UUID.randomUUID().toString());
        user.setAddress(address);
        user.setPassword(password);
        user.setUsername(username);
        user.setSchool(school);

        return R.error("注册失败，请仔细检查");
    }

}
