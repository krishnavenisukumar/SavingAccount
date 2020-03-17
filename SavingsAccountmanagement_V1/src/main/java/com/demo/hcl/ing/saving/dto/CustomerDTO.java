package com.demo.hcl.ing.saving.dto;

import com.demo.hcl.ing.saving.entity.Customer;

public class CustomerDTO {
	
	private Customer customer;

	public CustomerDTO()
	{
		
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerDTO(Customer customer) {
		super();
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customer=" + customer + "]";
	}
	
	
	

}
