package com.stg.restaurententity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Food implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int foodId;
	@Column(name = "food_catogory", length = 25, nullable = false)
	private String foodCatogory;
	@Column(name = "veg_nonveg", length = 25, nullable = false)
	private String vegOrNonveg;
	@Column(name = "food_name", length = 25, nullable = false)
	private String foodName;
	@Column(name = "food_price", length = 10, nullable = false)
	private float foodPrice;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "restaurentRef", nullable = false)
	@JsonManagedReference
	private Restaurent restaurent;

	public Food(int foodId, String foodCatogory, String vegOrNonveg, String foodName, float foodPrice,
			Restaurent restaurent) {
		super();
		this.foodId = foodId;
		this.foodCatogory = foodCatogory;
		this.vegOrNonveg = vegOrNonveg;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.restaurent = restaurent;
	}

	public Food() {
		super();
	}
	
	
	
}
