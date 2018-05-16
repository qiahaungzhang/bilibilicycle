package cn.bilibilicycle.entity;

import java.io.Serializable;

/**
 * 用户实体类
 * @author 22934
 *
 */
public class User implements Serializable{
	private String id;
	private String username;
	private String password;
	private String school;
	private String address;
	private String tel;


	public String getTel() {
		return tel;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setTel(String tel) {
		this.tel = tel;

	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
