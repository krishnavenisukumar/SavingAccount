package com.demo.hcl.ing.saving.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	public Customer()
	{
		super();
	}
	@Id
	private String customerId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String password;
	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private Integer zipCode;
	@OneToMany(targetEntity = Account.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_fk", referencedColumnName = "customerId")
	private List<Account> account;
	
	private String phoneNumber;
	private String emailAddress;
	private Integer accountOpeningBalance;
	private String dateOfBirth;
	private String citizenship;
	private String aadharNumber;
	private String passportNumber;
	private String accountType;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Integer getAccountOpeningBalance() {
		return accountOpeningBalance;
	}
	public void setAccountOpeningBalance(Integer accountOpeningBalance) {
		this.accountOpeningBalance = accountOpeningBalance;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	public Customer(String customerId, String firstName, String middleName, String lastName, String gender,
			String address1, String address2, String city, String state, Integer zipCode, List<Account> account,
			String phoneNumber, String emailAddress, Integer accountOpeningBalance, String dateOfBirth,
			String citizenship, String aadharNumber, String passportNumber, String accountType) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.account = account;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.accountOpeningBalance = accountOpeningBalance;
		this.dateOfBirth = dateOfBirth;
		this.citizenship = citizenship;
		this.aadharNumber = aadharNumber;
		this.passportNumber = passportNumber;
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", gender=" + gender + ", address1=" + address1 + ", address2=" + address2
				+ ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", account=" + account
				+ ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + ", accountOpeningBalance="
				+ accountOpeningBalance + ", dateOfBirth=" + dateOfBirth + ", citizenship=" + citizenship
				+ ", aadharNumber=" + aadharNumber + ", passportNumber=" + passportNumber + ", accountType="
				+ accountType + "]";
	}
	
	
}