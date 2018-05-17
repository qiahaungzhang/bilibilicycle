package cn.bilibilicycle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"cn.bilibilicycle.service","cn.bilibilicycle.controller"},exclude = {DataSourceAutoConfiguration.class})
@MapperScan("cn.bilibilicycle.dao")
public class BilibilicycleApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(BilibilicycleApplication.class, args);
	}
}
