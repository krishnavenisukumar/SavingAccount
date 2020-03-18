package com.demo.hcl.ing.saving.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hcl.ing.saving.dao.AccountDao;
import com.demo.hcl.ing.saving.entity.Account;

@Service
public class AccountServieImpl implements AccountService {

	@Autowired
	AccountDao accountDao;
	@Override
	public Account findByAccountNumber(Long accountNumber) {
		
		Account accountdetails = accountDao.findByAccountNumber(accountNumber);
		System.out.println("accountdetails = "+accountdetails);
		return accountdetails;
		
	}

}
