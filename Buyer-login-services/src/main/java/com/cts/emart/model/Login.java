package com.cts.emart.model;

public class Login {
	private int userId;
	private String userName;
	private String password;
	
	public Login() {
		
	}
	
	public Login(int userId,String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		this.userId=userId;
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
