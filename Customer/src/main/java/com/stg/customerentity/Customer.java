package com.stg.customerentity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id", length = 10)
	private int customerId;
	@Column(name = "customer_name", length = 10)
	private String customerName;
	@Column(name = "email", length = 35)
	private String email;
	@Column(name = "phone_no", length = 10)
	private String phoneNo;
	
	@JsonManagedReference
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customerRef")
	private List<Address> addresses;
	
	public Customer() {
		super();
	}


	public Customer(int customerId, String customerName, String email, String phoneNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", phoneNo=" + phoneNo + "]";
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	



}
