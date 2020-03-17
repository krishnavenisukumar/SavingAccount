package com.demo.hcl.ing.saving.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hcl.ing.saving.dto.TransferAccount;
import com.demo.hcl.ing.saving.dto.TransferResponseDTO;
import com.demo.hcl.ing.saving.entity.Account;
import com.demo.hcl.ing.saving.entity.Transaction;
import com.demo.hcl.ing.saving.exception.NotSufficientFundException;
import com.demo.hcl.ing.saving.repo.AccountRepo;
import com.demo.hcl.ing.saving.repo.TransactionRepo;
import com.demo.hcl.ing.saving.service.TransactionService;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepo TransactionRepo;
	@Autowired
	private AccountRepo accountRepo;

	@Override
	public List<Transaction> getAllTransaction() {

		return TransactionRepo.findAll();
	}

	/*
	 * @Override public void transfer(String fromAccount, String toAccount, Double
	 * amount) throws AccountNotFoundException { Account account =
	 * accountRepo.findById(fromAccount).orElseThrow(AccountNotFoundException::new);
	 * if (account.getBalance() - amount < 1000) throw new
	 * NotSufficientFundException(); account.setBalance(account.getBalance() -
	 * amount); accountRepo.save(account);
	 * 
	 * Account account1 =
	 * accountRepo.findById(toAccount).orElseThrow(AccountNotFoundException::new);
	 * account1.setBalance(account1.getBalance() + amount);
	 * accountRepo.save(account1);
	 * 
	 * Transaction log = new Transaction(fromAccount, toAccount, amount, "Done",
	 * "Credit"); TransactionRepo.save(log);
	 * 
	 * }
	 */
	@Override
	public Optional<TransferResponseDTO> Transfer(String fromAccount, String toAccount, Double amount)throws AccountNotFoundException {
		
		TransferResponseDTO transferResponseDTO=new TransferResponseDTO();
		Account account = accountRepo.findById(fromAccount).orElseThrow(AccountNotFoundException::new);
		if (account.getBalance() - amount < 1000)
			throw new NotSufficientFundException();
		account.setBalance(account.getBalance() - amount);
		accountRepo.save(account);

		Account account1 = accountRepo.findById(toAccount).orElseThrow(AccountNotFoundException::new);
		account1.setBalance(account1.getBalance() + amount);
		accountRepo.save(account1);

		Transaction log = new Transaction(fromAccount, toAccount, amount, "Done", "Credit");
		TransactionRepo.save(log);

		return Optional.of(transferResponseDTO);
	}

}
