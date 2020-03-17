package com.demo.hcl.ing.saving.serviceImpl;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hcl.ing.saving.entity.Account;
import com.demo.hcl.ing.saving.entity.Transaction;
import com.demo.hcl.ing.saving.exception.NotSufficientFundException;
import com.demo.hcl.ing.saving.repo.AccountRepo;
import com.demo.hcl.ing.saving.repo.AccountTransactionRepo;
import com.demo.hcl.ing.saving.repo.CustomerRepo;
import com.demo.hcl.ing.saving.repo.TransactionRepo;
import com.demo.hcl.ing.saving.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountRepo;

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public List<Account> getAllAccounts() {
		return accountRepo.findAll();
	}

	@Override
	public Account createAccount(Account account) {

		Account account1 = accountRepo.save(account);
		customerRepo.save(account.getCustomer());

		return account1;
	}

}
