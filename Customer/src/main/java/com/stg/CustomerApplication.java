package com.stg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.stg.dao.AddressRepository;
import com.stg.dao.CustomerRepository;


@SpringBootApplication
public class CustomerApplication implements Runnable{

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public void run() {
		 
	}

}
