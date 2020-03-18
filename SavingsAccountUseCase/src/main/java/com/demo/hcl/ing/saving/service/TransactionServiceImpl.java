package com.demo.hcl.ing.saving.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hcl.ing.saving.dao.AccountDao;
import com.demo.hcl.ing.saving.dao.BeneficiaryDao;
import com.demo.hcl.ing.saving.dao.TransactionDao;
import com.demo.hcl.ing.saving.entity.Account;
import com.demo.hcl.ing.saving.entity.Beneficiary;
import com.demo.hcl.ing.saving.entity.Transaction;
import com.demo.hcl.ing.saving.utils.AccountUtils;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactionDao;
	@Autowired
	AccountUtils accountUtils;
	@Autowired
	AccountService accountService;
	@Autowired
	AccountDao accountDao;
	@Autowired
	BeneficiaryDao beneficiaryDao;

	public Transaction performTransaction(Transaction trans) {
		Transaction transaction = null;
		Boolean status = false;
		Boolean flag = false;
		Double amountToTransfer = trans.getBalance();
		Double debitAccountBalance = getBalance(trans.getFromAccount());

		status = validateBalances(debitAccountBalance, amountToTransfer);

		flag = validateBeneficiary(trans);
		if (flag) {

			if (status) {
				trans.setTransactionId(accountUtils.generateNewTransactionId());
				trans.setTransactionDate(new Date());
				transaction = transactionDao.save(trans);
			}

			updateDebitAccountBalance(trans, debitAccountBalance);

			Double creditAccountBalance = getBalance(trans.getToAccount());
			updateCreditAccountBalance(trans, creditAccountBalance);
		} else {
			System.out.println("Account is not associated with beneficiary");
		}
		return transaction;

	}

	public Double getBalance(Long accountNumber) {
		Account accountdetails = accountService.findByAccountNumber(accountNumber);
		System.out.println("accountdetails" + accountdetails.getBalance());
		return accountdetails.getBalance();
	}

	public Boolean validateBalances(Double debitAccountBalance, Double amountToTransfer) {
		Boolean status = false;
		if (debitAccountBalance < amountToTransfer) {
			status = false;
		} else {
			status = true;
		}
		return status;
	}

	public void updateDebitAccountBalance(Transaction accountTransaction, Double debitAccountBalance) {
		Account accountdetails = accountService.findByAccountNumber(accountTransaction.getFromAccount());
		Account account = new Account();
		account.setAccountNumber(accountTransaction.getFromAccount());
		account.setBalance(debitAccountBalance - (accountTransaction.getBalance()));
		account.setAccountBranch(accountdetails.getAccountBranch());
		account.setIfscCode(accountdetails.getIfscCode());
		System.out.println("Before Debit object is " + account);
		accountDao.save(account);
	}

	public void updateCreditAccountBalance(Transaction accountTransaction, Double creditAccountBalance) {
		System.out.println("creditAccountBalance" + creditAccountBalance);
		Account accountdetails = accountService.findByAccountNumber(accountTransaction.getToAccount());
		Account account = new Account();
		account.setAccountNumber(accountTransaction.getToAccount());
		account.setBalance(creditAccountBalance + (accountTransaction.getBalance()));
		account.setAccountBranch(accountdetails.getAccountBranch());
		account.setIfscCode(accountdetails.getIfscCode());
		System.out.println("Credited Account " + account);
		accountDao.save(account);
	}

	public Boolean validateBeneficiary(Transaction transaction) {
		List<Beneficiary> beneficiaryList = beneficiaryDao.findByCustomerAccountNumber(transaction.getFromAccount());
		System.out.println("Extracted beneficiaryList = " + beneficiaryList);
		Boolean flag = false;
		for (Beneficiary bf : beneficiaryList) {
			if (bf.getBeneficiaryAccountNumber() == transaction.getToAccount()) {
				flag = true;
				break;
			}

		}
		return flag;
	}

	

}
