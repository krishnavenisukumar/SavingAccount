package com.demo.hcl.ing.saving.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.hcl.ing.saving.entity.Customer;
import com.demo.hcl.ing.saving.entity.CustomerCredentials;
import com.demo.hcl.ing.saving.service.RegisterNewCustomer;

@RunWith(MockitoJUnitRunner.Silent.class)
public class LoginControllerTest {
	CustomerCredentials customerCredentials = null;
	Customer customer = null;

	@InjectMocks
	AccountController accountController;

	@Mock
	RegisterNewCustomer registerNewCustomer;

	@Before
	public void before() {

		customerCredentials = new CustomerCredentials();
		customerCredentials.setEmail("dkasgar1@gmail.com");
		customerCredentials.setPassword("kasgar");

		customer = new Customer();
		customer.setEmailAddress("dkasgar1@gmail.com");
		customer.setPassword("kasgar");

	}

	@Test
	public void testCheckLoginPositive() {
		Mockito.when(registerNewCustomer.validateUser(customerCredentials)).thenReturn(true);
		boolean response = registerNewCustomer.validateUser(customerCredentials).booleanValue();
		assertEquals(true, response);
	}
}
