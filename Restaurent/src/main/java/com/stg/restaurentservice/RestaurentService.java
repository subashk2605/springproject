package com.stg.restaurentservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stg.restaurententity.Restaurent;
@Service
public interface RestaurentService {

	public abstract List readAll(); 
	
}
