package com.stg.restaurentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.restaurententity.Restaurent;
import com.stg.restaurentservice.RestaurentServiceImpl;

@RestController
@RequestMapping (value = "res")
public class RestaurentController {
	@Autowired
	private RestaurentServiceImpl service;
	
	
	@GetMapping (value = "readall")
	public  List readAll() {
		return service.readAll();
	}

}
