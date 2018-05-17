package cn.bilibilicycle.example.demo;

import cn.bilibilicycle.BilibilicycleApplication;
import cn.bilibilicycle.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BilibilicycleApplication.class)
public class BilibilicycleApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("username","张三");
		map.put("password","123");
		int result=userService.queryByUserName(map);
		System.out.println(result);
	}

}
