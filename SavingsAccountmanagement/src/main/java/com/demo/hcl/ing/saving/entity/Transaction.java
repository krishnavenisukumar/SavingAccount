package com.demo.hcl.ing.saving.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Txn_Id;
	private String Account_Num;
	private String Beneficiary_Account_Number;
	private Double Txn_Amount;
	private LocalDate txn_date;
	private String txn_status;
	private String txn_type;

	public Transaction() {
		super();

	}

	public String getTxn_Id() {
		return Txn_Id;
	}

	public void setTxn_Id(String txn_Id) {
		Txn_Id = txn_Id;
	}

	public String getAccount_Num() {
		return Account_Num;
	}

	public void setAccount_Num(String account_Num) {
		Account_Num = account_Num;
	}

	public String getBeneficiary_Account_Number() {
		return Beneficiary_Account_Number;
	}

	public void setBeneficiary_Account_Number(String beneficiary_Account_Number) {
		Beneficiary_Account_Number = beneficiary_Account_Number;
	}

	public Double getTxn_Amount() {
		return Txn_Amount;
	}

	public void setTxn_Amount(Double txn_Amount) {
		Txn_Amount = txn_Amount;
	}

	public LocalDate getTxn_date() {
		return txn_date;
	}

	public void setTxn_date(LocalDate txn_date) {
		this.txn_date = txn_date;
	}

	public String getTxn_status() {
		return txn_status;
	}

	public void setTxn_status(String txn_status) {
		this.txn_status = txn_status;
	}

	public String getTxn_type() {
		return txn_type;
	}

	public void setTxn_type(String txn_type) {
		this.txn_type = txn_type;
	}

	public Transaction(String account_Num, String beneficiary_Account_Number, Double txn_Amount,
			String txn_status, String txn_type) {
		super();
		Account_Num = account_Num;
		Beneficiary_Account_Number = beneficiary_Account_Number;
		Txn_Amount = txn_Amount;
		this.txn_date = LocalDate.now();
		this.txn_status = txn_status;
		this.txn_type = txn_type;
	}

}