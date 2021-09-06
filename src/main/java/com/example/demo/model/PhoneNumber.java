package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer phoneId;
	private String type;
	private String phoneNumber;
	private Boolean activate;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "customerId", nullable = false) //customerId is foreign key pointing to primary key of department
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Customer customer;
	
	public Integer getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public PhoneNumber() {
		super();
	}

//	public PhoneNumber(String type, String phoneNumber, Boolean activate, Customer customer) {
//		super();
//		this.type = type;
//		this.phoneNumber = phoneNumber;
//		this.activate = activate;
//		this.customer = customer;
//	}

	public String getType() {
		return type;
	}

	public PhoneNumber(Integer phoneId, String type, String phoneNumber, Boolean activate) {
	super();
	this.phoneId = phoneId;
	this.type = type;
	this.phoneNumber = phoneNumber;
	this.activate = activate;
}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getActivate() {
		return activate;
	}

	public void setActivate(Boolean activate) {
		this.activate = activate;
	}

	@Override
	public String toString() {
		return "PhoneNumber [phoneId=" + phoneId + ", type=" + type + ", phoneNumber=" + phoneNumber + ", activate="
				+ activate + "]";
	}
	
	
	
}
