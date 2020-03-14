package com.cts.emart.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uId")
	private int userId;
	@Column(name="uName")
	private String userName;
	@Column(name="pass")
	private String password;
	@Column(name="role")
	private String role;

	
	public Register() {
		
	}
	
	public Register(int userId, String userName, String password,String role) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role=role;

	}

	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
