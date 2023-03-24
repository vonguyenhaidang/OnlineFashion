package com.example.models;

public class Stylist {
	private String stylistID;
	private String stylistName;
	private String stylistEmail;
	private String stylistDesc;
	private String stylistPassword;

	public Stylist(String stylistID, String stylistName, String stylistEmail, String stylistDesc,
			String stylistPassword) {
		super();
		this.stylistID = stylistID;
		this.stylistName = stylistName;
		this.stylistEmail = stylistEmail;
		this.stylistDesc = stylistDesc;
		this.stylistPassword = stylistPassword;
	}

	public Stylist() {
		super();
	}

	public String getStylistID() {
		return stylistID;
	}

	public void setStylistID(String stylistID) {
		this.stylistID = stylistID;
	}

	public String getStylistName() {
		return stylistName;
	}

	public void setStylistName(String stylistName) {
		this.stylistName = stylistName;
	}

	public String getStylistEmail() {
		return stylistEmail;
	}

	public void setStylistEmail(String stylistEmail) {
		this.stylistEmail = stylistEmail;
	}

	public String getStylistDesc() {
		return stylistDesc;
	}

	public void setStylistDesc(String stylistDesc) {
		this.stylistDesc = stylistDesc;
	}

	public String getStylistPassword() {
		return stylistPassword;
	}

	public void setStylistPassword(String stylistPassword) {
		this.stylistPassword = stylistPassword;
	}

	@Override
	public String toString() {
		return "Stylist [stylistID=" + stylistID + ", stylistName=" + stylistName + ", stylistEmail=" + stylistEmail
				+ ", stylistDesc=" + stylistDesc + ", stylistPassword=" + stylistPassword + "]";
	}

}
