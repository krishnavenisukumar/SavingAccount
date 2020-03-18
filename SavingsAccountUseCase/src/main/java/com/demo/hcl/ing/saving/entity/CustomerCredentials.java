package com.demo.hcl.ing.saving.entity;

public class CustomerCredentials {

	private String email;
	private String password;
	@Override
	public String toString() {
		return "CustomerCredentials [email=" + email + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CustomerCredentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public CustomerCredentials()
	{
		super();
	}
	
}
