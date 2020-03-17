package com.demo.hcl.ing.saving.controller;

import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hcl.ing.saving.dto.TransferAccountDTO;
import com.demo.hcl.ing.saving.dto.TransferResponseDTO;
import com.demo.hcl.ing.saving.entity.Transaction;
import com.demo.hcl.ing.saving.repo.TransactionRepo;
import com.demo.hcl.ing.saving.service.TransactionService;


@RestController
@RequestMapping(name = "/myprofile")
public class TransactionController {

	@Autowired
	private TransactionService tnxService;

	@Autowired
	private TransactionRepo tnxRepo;

	private TransactionService transactionService;

	@GetMapping(path = "/alltransaction")
	public List<Transaction> getAllTransaction() {
		return tnxService.getAllTransaction();

	}

	@PostMapping(path = "/transfer")
	public ResponseEntity<Optional<TransferResponseDTO>> transferAccount(@RequestBody TransferAccountDTO transferAccount)
			throws AccountNotFoundException {

		Optional<TransferResponseDTO> response = transactionService.Transfer(transferAccount.getFromAccount(),
				transferAccount.getToAccount(), transferAccount.getAmount());

		response.get().setStatusCode(200);
		response.get().setStatusMessage("Your transaction is successfull");

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
