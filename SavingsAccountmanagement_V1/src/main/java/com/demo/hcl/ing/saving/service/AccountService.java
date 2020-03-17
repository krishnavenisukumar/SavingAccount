package com.demo.hcl.ing.saving.service;

import java.util.List;

import com.demo.hcl.ing.saving.entity.Account;



public interface AccountService {

	public List<Account> getAllAccounts();

	Account createAccount(Account account);


	
}
