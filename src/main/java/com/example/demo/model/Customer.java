package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customerdetails")
public class Customer {

	@Id
	@GeneratedValue
	private Integer customerId;
	
	/*
	 * TODO 
	 * Instead of @ElementCollection One-to-Many association can be used to improve performance.
	 */
//	@Embedded
//	@ElementCollection
//	private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)//, cascade = CascadeType.ALL)
	private Set<PhoneNumber> phoneNumbers;
	
	public Customer() {
		super();
	}

//	public Customer(List<PhoneNumber> phoneNumbers) {
//		super();
//		this.phoneNumbers = phoneNumbers;
//	}
	

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

//	public List<PhoneNumber> getPhoneNumbers() {
//		return phoneNumbers;
//	}
//
//	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
//		this.phoneNumbers = phoneNumbers;
//	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "]"; //", phoneNumbers=" + phoneNumbers + "]";
	}

//	public Set<PhoneNumber> getPhoneNumbers() {
//		return phoneNumbers;
//	}
//
//	public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
//		this.phoneNumbers = phoneNumbers;
//	}

	
}
