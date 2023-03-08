package com.java.springweb.dto;

import java.io.Serializable;

public class RegisterDto implements Serializable {

    private String name;
	
	private String email;
	
	private String contactNumber;
	
	private String password;
	
	private String country;
	
	private String pinCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "RegisterDto [name=" + name + ", email=" + email + ", contactNumber=" + contactNumber + ", password="
				+ password + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
}
