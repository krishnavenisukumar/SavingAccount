package com.demo.hcl.ing.saving.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.hcl.ing.saving.dao.CustomerDao;
import com.demo.hcl.ing.saving.entity.Customer;
import com.demo.hcl.ing.saving.entity.CustomerCredentials;

@RunWith(MockitoJUnitRunner.Silent.class)
public class LoginServiceTest {
	CustomerCredentials customerCredentials = null;
	CustomerCredentials customerCredentials2 = null;
	Customer customer = null;

	@InjectMocks
	RegisterNewCustomerImpl registerNewCustomerImpl;

	@Mock
	CustomerDao customerDao;

	@Before
	public void before() {

		customerCredentials = new CustomerCredentials();
		customerCredentials.setEmail("dkasgar1@gmail.com");
		customerCredentials.setPassword("kasgar");

		customerCredentials2 = new CustomerCredentials();
		customerCredentials2.setEmail("dkasgar1@gmail.com");
		customerCredentials2.setPassword("kasgars");

		customer = new Customer();
		customer.setEmailAddress("dkasgar1@gmail.com");
		customer.setPassword("kasgar");
		customer.setFirstName("Deepak");

	}

	@Test
	public void testCheckLoginPositive() {

		Mockito.when(customerDao.findByEmailAddressAndPassword(customerCredentials.getEmail(),
				customerCredentials.getPassword())).thenReturn(customer);
		Boolean response = registerNewCustomerImpl.validateUser(customerCredentials);
		assertEquals(true, response);

	}

	@Test
	public void testCheckLoginException() {

		Mockito.when(customerDao.findByEmailAddressAndPassword(customerCredentials.getEmail(),
				customerCredentials.getPassword())).thenReturn(customer);
		registerNewCustomerImpl.validateUser(customerCredentials2);

	}
}
