package com.demo.hcl.ing.saving.service;

import com.demo.hcl.ing.saving.entity.Account;

public interface AccountService {
	
	public Account findByAccountNumber(Long accountNumber);

}
