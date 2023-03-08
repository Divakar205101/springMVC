package com.java.springweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="user_info")
public class Register implements Serializable {
        
	    @Id
	    @GenericGenerator(name= "auto", strategy = "increment")
	    @GeneratedValue(generator = "auto")
	    @Column(name="id")
	    private long id;
	     
	    @Column(name="name")
	    private String name;
	    
	    @Column(name="email")
	    private String email;
		
	    @Column(name="contactNumber")
		private String contactNumber;
		
	    @Column(name="password")
		private String password;
		
	    @Column(name="country")
		private String country;
		
	    @Column(name="pinCode")
		private String pinCode;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

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

		
		
		
}
