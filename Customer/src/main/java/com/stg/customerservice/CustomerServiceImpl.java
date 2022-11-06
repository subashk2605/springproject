package com.stg.customerservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.customerentity.Customer;
import com.stg.customerexception.CustomerException;
import com.stg.dao.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public boolean findByExist(Customer customer) {
		if (repository.findAll().equals(customer)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public Customer findByCustomerId(int customerId) {
		Customer customer = null;
		Optional<Customer> optional = repository.findById(customerId);
		if(optional.isPresent()) {
			customer = optional.get();
		}
		return customer;
	}

//	@Override
//	public String create(Customer customer) throws CustomerException {
//
//		if (!findByExist(customer)) {
//			repository.save(customer);
//			return "Customer created Sucessfully";
//
//		} else {
//			throw new CustomerException("Customer Already Exist");
//		}
//
//	}

	@Override
	public List<Customer> readAll()  {
		List<Customer> customers = repository.findAll();
		System.out.println(customers);
		return customers;
	}

//	@Override
//	public List<Customer> fetchByCustomerId(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
