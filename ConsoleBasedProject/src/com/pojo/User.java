package com.pojo;

public class User {
	private String userName;
	private String adharCard;
	private String panCard;
	private String email;
	private String mobileNumber;
	private String address;

	public User() {
		super();
	}

	public User(String userName, String adharCard, String panCard, String email, String newMobileNumber, String address) {
		super();
		this.userName = userName;
		this.adharCard = adharCard;
		this.panCard = panCard;
		this.email = email;
		this.mobileNumber = newMobileNumber;
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", adharCard=" + adharCard + ", panCard=" + panCard + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + "]";
	}	
}
