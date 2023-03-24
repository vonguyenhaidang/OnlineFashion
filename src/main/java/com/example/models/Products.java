package com.example.models;

public class Products {
	private String prodID;
	private String prodName;
	private float prodPrice;
	private String prodDesc;
	private boolean available;
	private Cat prodcat;
	public Products(String prodID, String prodName, float prodPrice, String prodDesc, boolean available, Cat prodcat) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodDesc = prodDesc;
		this.available = available;
		this.prodcat = prodcat;
	}
	
	public Products() {
		
	}

	public String getProdID() {
		return prodID;
	}

	public void setProdID(String prodID) {
		this.prodID = prodID;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public float getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Cat getProdcat() {
		return prodcat;
	}

	public void setProdcat(Cat prodcat) {
		this.prodcat = prodcat;
	}
	
}
