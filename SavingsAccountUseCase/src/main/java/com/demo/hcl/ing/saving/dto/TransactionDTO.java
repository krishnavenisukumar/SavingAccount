package com.demo.hcl.ing.saving.dto;

import com.demo.hcl.ing.saving.entity.Transaction;

public class TransactionDTO {
	
	
	private Transaction transaction;

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public TransactionDTO(Transaction transaction) {
		super();
		this.transaction = transaction;
	}
	
	public TransactionDTO()
	{
		super();
	}

}
