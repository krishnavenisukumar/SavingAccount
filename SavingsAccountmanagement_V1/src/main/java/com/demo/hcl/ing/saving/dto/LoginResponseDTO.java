package com.demo.hcl.ing.saving.dto;

import com.demo.hcl.ing.saving.entity.Account;
import com.demo.hcl.ing.saving.entity.AccountType;

public class LoginResponseDTO {

	private String customerId;
	
	private String statusMessage;
	private Integer statusCode;
	
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	public LoginResponseDTO() {
		super();
	}
	
	
}
