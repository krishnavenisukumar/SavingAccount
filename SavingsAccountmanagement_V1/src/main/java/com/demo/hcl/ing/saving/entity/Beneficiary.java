package com.demo.hcl.ing.saving.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Beneficiary {
	@Id
	private Long accountNumber;
	private String payeeName;
	private String nickName;
	private String registerPayerfor; 
	private String accountName;
	private String accountBranch;
	private String accountType;
	private String createdBy;
	private Date createdDate;
	
	
	public Beneficiary(String payeeName, String nickName, String registerPayerfor, Long accountNumber, String accountName,
			String accountBranch, String accountType, String createdBy, Date createdDate) {
		super();
		this.payeeName = payeeName;
		this.nickName = nickName;
		this.registerPayerfor = registerPayerfor;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBranch = accountBranch;
		this.accountType = accountType;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}
	
	
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
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
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "Account [payeeName=" + payeeName + ", nickName=" + nickName + ", registerPayerfor=" + registerPayerfor
				+ ", accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBranch="
				+ accountBranch + ", accountType=" + accountType + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + "]";
	}
	
	
	
}
