package com.demo.hcl.ing.saving.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accounts_table")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountNumber;
	private String ifsc;
	private Boolean active;
	private Double balance;
	private AccountType accountType;

	@ManyToOne
	private Customer customer;

	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<AccountTransaction> transactionList = new ArrayList<>();

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<AccountTransaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<AccountTransaction> transactionList) {
		this.transactionList = transactionList;
	}

	public Account(String ifsc, Boolean active, Double balance, AccountType accountType) {
		super();
		this.ifsc = ifsc;
		this.active = active;
		this.balance = balance;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", ifsc=" + ifsc + ", active=" + active + ", balance="
				+ balance + ", accountType=" + accountType + "]";
	}

	public Account() {
		super();

	}

}
