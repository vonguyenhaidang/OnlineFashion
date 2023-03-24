package com.example.models;

import java.sql.Date;

public class CustomerPayment {
	private String paymentID;
	private String payType;
	private String provider;
	private int accNum;
	private Date expiryDate;

	public CustomerPayment(String paymentID, String payType, String provider, int accNum, Date expiryDate) {
		super();
		this.paymentID = paymentID;
		this.payType = payType;
		this.provider = provider;
		this.accNum = accNum;
		this.expiryDate = expiryDate;
	}

	public CustomerPayment() {
		super();
	}

	public String getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "CustomerPayment [paymentID=" + paymentID + ", payType=" + payType + ", provider=" + provider
				+ ", accNum=" + accNum + ", expiryDate=" + expiryDate + "]";
	}

}
