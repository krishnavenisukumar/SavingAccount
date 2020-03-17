package com.demo.hcl.ing.saving.dto;

import com.demo.hcl.ing.saving.entity.Transaction;

public class TransferResponseDTO {

	private Transaction transaction;
	private String statusMessage;
	private Integer statusCode;

	public TransferResponseDTO() {
		super();

	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "TransferResponseDTO [transaction=" + transaction + ", statusMessage=" + statusMessage + ", statusCode="
				+ statusCode + "]";
	}

}
