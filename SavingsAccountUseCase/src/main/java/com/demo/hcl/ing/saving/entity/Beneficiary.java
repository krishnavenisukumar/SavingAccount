package com.demo.hcl.ing.saving.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beneficiary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Long beneficiaryAccountNumber;
	private String accountHolderName;
	private String nickName;
	private String registerPayerfor;
	private String accountBranch;
	private String accountType;
	private String createdBy;
	private Long customerAccountNumber;

	public Beneficiary() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRegisterPayerfor() {
		return registerPayerfor;
	}

	public void setRegisterPayerfor(String registerPayerfor) {
		this.registerPayerfor = registerPayerfor;
	}

	public String getAccountBranch() {
		return accountBranch;
	}

	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Long getCustomerAccountNumber() {
		return customerAccountNumber;
	}

	public void setCustomerAccountNumber(Long customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}

	public Beneficiary(Integer id, Long beneficiaryAccountNumber, String accountHolderName, String nickName,
			String registerPayerfor, String accountBranch, String accountType, String createdBy,
			Long customerAccountNumber) {
		super();
		this.id = id;
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
		this.accountHolderName = accountHolderName;
		this.nickName = nickName;
		this.registerPayerfor = registerPayerfor;
		this.accountBranch = accountBranch;
		this.accountType = accountType;
		this.createdBy = createdBy;
		this.customerAccountNumber = customerAccountNumber;
	}

	public Long getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(Long beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	@Override
	public String toString() {
		return "Beneficiary [id=" + id + ", beneficiaryAccountNumber=" + beneficiaryAccountNumber
				+ ", accountHolderName=" + accountHolderName + ", nickName=" + nickName + ", registerPayerfor="
				+ registerPayerfor + ", accountBranch=" + accountBranch + ", accountType=" + accountType
				+ ", createdBy=" + createdBy + ", customerAccountNumber=" + customerAccountNumber + "]";
	}

}