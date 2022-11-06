package com.stg.customerservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stg.customerentity.Customer;
import com.stg.customerexception.CustomerException;

@Service
public interface CustomerService {
	
	public abstract boolean findByExist(Customer customer);

	public abstract List<Customer> readAll() throws CustomerException;
	
	public abstract Customer findByCustomerId(int customerId);
	
	
	

}
