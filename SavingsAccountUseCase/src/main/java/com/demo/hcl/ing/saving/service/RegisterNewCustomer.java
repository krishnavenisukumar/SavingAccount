package com.demo.hcl.ing.saving.service;

import com.demo.hcl.ing.saving.entity.Customer;
import com.demo.hcl.ing.saving.entity.CustomerCredentials;

public interface RegisterNewCustomer {
	
	public Customer newCustomerDetails(Customer customer);
	
	public Boolean validateUser(CustomerCredentials customerCredentials);

}
