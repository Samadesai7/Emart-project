package com.cts.emart.model;

public class Register {
	
	private int userId;
	private String userName;
	private String password;
	private String role;

	
	public Register() {
		
	}
	
	public Register(int userId, String userName, String password,String role) {
		super();
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
