package com.demo.hcl.ing.saving.service;

import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import com.demo.hcl.ing.saving.dto.TransferAccountDTO;
import com.demo.hcl.ing.saving.dto.TransferResponseDTO;
import com.demo.hcl.ing.saving.entity.Transaction;

public interface TransactionService {

	List<Transaction> getAllTransaction();

	/*
	 * void transfer(String fromAccount, String toAccount, Double amount)throws
	 * AccountNotFoundException;
	 */

		public Optional<TransferResponseDTO> Transfer(String fromAccount, String toAccount, Double amount)throws AccountNotFoundException;
}
