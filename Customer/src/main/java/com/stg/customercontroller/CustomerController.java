package com.stg.customercontroller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stg.customerentity.Address;
import com.stg.customerentity.Customer;
import com.stg.customerexception.CustomerException;
import com.stg.customerservice.CustomerServiceImpl;


@RestController
@RequestMapping (value = "customer")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl serviceImpl;	
	
//	
	@RequestMapping (value = "/readall" , method = RequestMethod.GET)
	public  List readAll()  {
	List<Customer> customers = serviceImpl.readAll();
	System.out.println(customers.toString());
		List<Customer> list = new ArrayList<>();
		List<Address> aList = new ArrayList<>(); 
		for (int j = 0; j < list.size(); j++) {
			Customer i = list.get(j);
		
			
			System.out.println(i);
			System.out.println(i.getAddresses() + "printing address");
			if(i.getAddresses()!=null) {
				aList.add((Address) i.getAddresses());
				
			}
		}
		//Customer customer1 = new  Customer(1, "asdwq", "sw", "7373733");
		aList.toString();
		
		return aList;
		
		
		
	}
	@GetMapping (value = "/get")
	public String customer() {
		 Customer customer1 = serviceImpl.findByCustomerId(1);
		 
		return customer1.getAddresses().toString();
	}
	
	
	
	
//	@GetMapping (value = "id/{customerId}")
//	public Customer findBycustomerId(@PathVariable ("customerId") int customerId) {
//		return serviceImpl.findByCustomerId(customerId);
//	}
}
