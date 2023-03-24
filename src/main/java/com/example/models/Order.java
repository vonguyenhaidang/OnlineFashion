package com.example.models;

public class Order {
	private String orderID;
	private Customer user;
	private float totalPrice;
	private String status;
	private CustomerPayment cusPay;
	
	public Order(String orderID, Customer user, float totalPrice, String status, CustomerPayment cusPay) {
		super();
		this.orderID = orderID;
		this.user = user;
		this.totalPrice = totalPrice;
		this.status = status;
		this.cusPay = cusPay;
	}
	public Order() {
	}
	public Customer getUser() {
		return user;
	}

	public void setUser(Customer user) {
		this.user = user;
	}

	public CustomerPayment getCusPay() {
		return cusPay;
	}

	public void setCusPay(CustomerPayment cusPay) {
		this.cusPay = cusPay;
	}

	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
