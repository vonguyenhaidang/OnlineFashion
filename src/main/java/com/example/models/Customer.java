package com.example.models;

public class Customer {
	private String userID;
	private String userName;
	private String userFName;
	private String userLName;
	private String userEmail;
	private String userPassword;
	private String userAddress;

	public Customer(String userID, String userName, String userFName, String userLName, String userEmail,
			String userPassword, String userAddress) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userFName = userFName;
		this.userLName = userLName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
	}

	public Customer() {
		super();
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserFName() {
		return userFName;
	}

	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}

	public String getUserLName() {
		return userLName;
	}

	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "Customer [userID=" + userID + ", userName=" + userName + ", userFName=" + userFName + ", userLName="
				+ userLName + ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userAddress="
				+ userAddress + "]";
	}

}
