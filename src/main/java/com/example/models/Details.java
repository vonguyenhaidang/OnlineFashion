package com.example.models;

public class Details {
	private Products prod;
	private Order order;
	private int quantity;
	public Details(Products prod, Order order, int quantity) {
		super();
		this.prod = prod;
		this.order = order;
		this.quantity = quantity;
	}
	
	public Details() {
		
	}

	public Products getProd() {
		return prod;
	}

	public void setProd(Products prod) {
		this.prod = prod;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
