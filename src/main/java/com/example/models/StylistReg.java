package com.example.models;

public class StylistReg {
	private String stylistRegID;
	private String stylistRegName;
	private String stylistRegEmail;
	private String stylistRegDesc;
	private String stylistRegPassword;
	private String status;
	public String getStylistRegID() {
		return stylistRegID;
	}
	public void setStylistRegID(String stylistRegID) {
		this.stylistRegID = stylistRegID;
	}
	public String getStylistRegName() {
		return stylistRegName;
	}
	public void setStylistRegName(String stylistRegName) {
		this.stylistRegName = stylistRegName;
	}
	public String getStylistRegEmail() {
		return stylistRegEmail;
	}
	public void setStylistRegEmail(String stylistRegEmail) {
		this.stylistRegEmail = stylistRegEmail;
	}
	public String getStylistRegDesc() {
		return stylistRegDesc;
	}
	public void setStylistRegDesc(String stylistRegDesc) {
		this.stylistRegDesc = stylistRegDesc;
	}
	public String getStylistRegPassword() {
		return stylistRegPassword;
	}
	public void setStylistRegPassword(String stylistRegPassword) {
		this.stylistRegPassword = stylistRegPassword;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public StylistReg(String stylistRegID, String stylistRegName, String stylistRegEmail, String stylistRegDesc,
			String stylistRegPassword, String status) {
		super();
		this.stylistRegID = stylistRegID;
		this.stylistRegName = stylistRegName;
		this.stylistRegEmail = stylistRegEmail;
		this.stylistRegDesc = stylistRegDesc;
		this.stylistRegPassword = stylistRegPassword;
		this.status = status;
	}
	
	public StylistReg() {
		
	}
}
