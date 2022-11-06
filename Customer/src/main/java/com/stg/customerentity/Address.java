package com.stg.customerentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "address")

public class Address implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "door_no" , length = 5 )
	private int doorNo;
	@Column (name = "street_name" , length = 30 )
	private String StreetName;
	@Column (name = "city" , length = 25 )
	private String City;
	@Column (name = "state" , length = 25 )
	private String State;
	
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id" ,nullable = false)
	@JsonBackReference
	private Customer customerRef;


	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", StreetName=" + StreetName + ", City=" + City + ", State=" + State
				+ ", customerRef=" + customerRef + "]";
	}
	
	
	
	
	
	
	
 
}
