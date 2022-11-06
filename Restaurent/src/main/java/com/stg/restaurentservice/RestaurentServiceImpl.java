package com.stg.restaurentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.stg.dao.RestaurentRepository;
import com.stg.restaurententity.Restaurent;

public class RestaurentServiceImpl implements RestaurentService{
	@Autowired
	private RestaurentRepository repository;
	@Override
	public List readAll() {
		
		return repository.findAll();
	}

}
