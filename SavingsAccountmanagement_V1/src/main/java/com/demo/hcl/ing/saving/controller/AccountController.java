package com.demo.hcl.ing.saving.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hcl.ing.saving.dto.CustomerDTO;
import com.demo.hcl.ing.saving.entity.Customer;
import com.demo.hcl.ing.saving.service.RegisterNewCustomer;



@RestController
public class AccountController {

	
	@Autowired
	RegisterNewCustomer registerNewCustomer;
	
	@PostMapping("/register")
	public Customer newCustomerRegistrationDetails(@RequestBody CustomerDTO customer)
	{
	
		System.out.println("Customer is in controller " + customer);
	Customer customerDetails = registerNewCustomer.newCustomerDetails(customer.getCustomer());
		return customerDetails;
	}
}
