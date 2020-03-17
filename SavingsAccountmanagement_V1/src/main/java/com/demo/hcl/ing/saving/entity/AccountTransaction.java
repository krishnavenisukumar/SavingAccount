package com.demo.hcl.ing.saving.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accounttx2_table")

public class AccountTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate transDate;
	private double amount;
	private String type;

	@ManyToOne
	private Account account;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getTransDate() {
		return transDate;
	}

	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public AccountTransaction(LocalDate transDate, double amount, String type) {
		super();
		this.transDate = transDate;
		this.amount = amount;
		this.type = type;
	}

	public AccountTransaction() {
		super();

	}

}
