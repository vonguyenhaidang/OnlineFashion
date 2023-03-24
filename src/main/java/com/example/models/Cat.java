package com.example.models;

public class Cat {
	private String catID;
	private String catName;
	private String catDesc;
	public String getCatID() {
		return catID;
	}
	public void setCatID(String catID) {
		this.catID = catID;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatDesc() {
		return catDesc;
	}
	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}
	public Cat(String catID, String catName, String catDesc) {
		super();
		this.catID = catID;
		this.catName = catName;
		this.catDesc = catDesc;
	}
	
	public Cat() {
		
	}
}
