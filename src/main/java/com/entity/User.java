package com.entity;

import java.io.Serializable;

/**
 * 用户实体类
 * @author 22934
 *
 */
public class User implements Serializable{
	private String name;
	private String password;
	private String school;
	private String address;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
