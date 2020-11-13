package com.stest.login.bean;

public class Owner {
	private int id;
	private int shopId;
	private String name;
	private long phone;
	private int countryCode;
	private String email;
	private String gst;
	private String pan;
	private String aadhar;

	private Shop shop;

	public String toString() {
		return "{id=" + id + " ,shop details=" + shop.toString() + " ,phone=" + " ,country Code=" + countryCode
				+ " ,Email ID=" + email + " ,gst=" + gst + " ,pan=" + pan + " ,aadhar=" + aadhar;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

}
