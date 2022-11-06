package com.stg.restaurententity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Restaurent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private String restaurentNo;
	@Column(name = "restaurent_Name", length = 25, nullable = false)
	private String restaurentName;
	@Column(name = "restaurent_email", length = 25, nullable = false)
	private String restaurentEmail;
	@Column(name = "restaurent_phoneno", length = 25, nullable = false)
	private String restaurentPhoneNo;
	@Column(name = "restaurent_street", length = 25, nullable = false)
	private String restaurentStreet;
	@Column(name = "restaurent_city", length = 25, nullable = false)
	private String restaurentCity;
	@Column(name = "restaurent_state", length = 25, nullable = false)
	private String restaurentState;
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurentRef")
	private List<Food> foods;
	
	
	public Restaurent(String restaurentNo, String restaurentName, String restaurentEmail, String restaurentPhoneNo,
			String restaurentStreet, String restaurentCity, String restaurentState, List<Food> foods) {
		super();
		this.restaurentNo = restaurentNo;
		this.restaurentName = restaurentName;
		this.restaurentEmail = restaurentEmail;
		this.restaurentPhoneNo = restaurentPhoneNo;
		this.restaurentStreet = restaurentStreet;
		this.restaurentCity = restaurentCity;
		this.restaurentState = restaurentState;
		this.foods = foods;
	}
	public Restaurent() {
		super();
	}
	
	

}
