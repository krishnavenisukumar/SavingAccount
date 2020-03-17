package com.demo.hcl.ing.saving.dto;

public class LoginRequestDTO {

	private String customerId;
	private String password;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginRequestDTO() {
		super();
	}
	@Override
	public String toString() {
		return "LoginRequestDTO [customerId=" + customerId + ", password=" + password + "]";
	}
	
	

}
