package com.demo.hcl.ing.saving.dto;

public class TransferAccountDTO {

	private String fromAccount;
	private String toAccount;
	private Double amount;

	public TransferAccountDTO() {
		super();

	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public TransferAccountDTO(String fromAccount, String toAccount, Double amount) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}

}
