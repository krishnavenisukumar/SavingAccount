package com.demo.hcl.ing.saving.controller.response;

import java.util.List;

import com.demo.hcl.ing.saving.entity.Account;

public class CustomerResponse {

	private String customerName;
	private List<Account> accountNumber;
	
	public CustomerResponse() {}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Account> getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(List<Account> accountNumber) {
		this.accountNumber = accountNumber;
	}

}
