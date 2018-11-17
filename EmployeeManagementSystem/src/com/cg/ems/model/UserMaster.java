package com.cg.ems.model;

public class UserMaster {

	private String UserId;
	private String UserName;
	private String UserPassword;
	private String UserType;

	public UserMaster() {

	}

	public UserMaster(String userId, String userName, String userPassword,
			String userType) {
		super();
		UserId = userId;
		UserName = userName;
		UserPassword = userPassword;
		UserType = userType;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public String getUserType() {
		return UserType;
	}

	public void setUserType(String userType) {
		UserType = userType;
	}

}
