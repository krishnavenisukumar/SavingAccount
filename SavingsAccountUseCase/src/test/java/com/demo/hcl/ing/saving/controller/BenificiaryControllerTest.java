package com.demo.hcl.ing.saving.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.hcl.ing.saving.controller.response.ResponseObject;
import com.demo.hcl.ing.saving.dto.BeneficiaryDTO;
import com.demo.hcl.ing.saving.entity.Beneficiary;
import com.demo.hcl.ing.saving.service.RegisterNewBeneficiary;

@RunWith(MockitoJUnitRunner.class)
public class BenificiaryControllerTest {

	@Mock
	RegisterNewBeneficiary registerNewBeneficiary;

	@InjectMocks
	AccountController accountController;

	Beneficiary beneficiary = null;
	BeneficiaryDTO beneficiaryDTO = null;

	@Before
	public void before() {
		beneficiary = new Beneficiary();
		beneficiaryDTO = new BeneficiaryDTO();
		beneficiaryDTO.setBeneficiary(beneficiary);
		beneficiary.setAccountHolderName("Deepak Kasgar");
		beneficiary.setAccountBranch("Kormangla");
		beneficiary.setAccountType("Savings");
		beneficiary.setBeneficiaryAccountNumber(3L);
		beneficiary.setCreatedBy("Dk");
		beneficiary.setCustomerAccountNumber(1L);
		beneficiary.setNickName("Deepak");
		beneficiary.setRegisterPayerfor("Other Bank Transfers");
		beneficiary.setId(1);

	}

	@Test
	public void testNewBeneficiaryPositive() {
		Mockito.when(registerNewBeneficiary.saveBeneficiary(beneficiary)).thenReturn(beneficiary);
		ResponseEntity<ResponseObject> response = accountController.addNewBeneficiary(beneficiaryDTO);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}

	@Test
	public void testNewBeneficiaryNegative() {
		Beneficiary beneficiary1 = null;
		Mockito.when(registerNewBeneficiary.saveBeneficiary(beneficiary1)).thenReturn(beneficiary1);
		ResponseEntity<ResponseObject> response = accountController.addNewBeneficiary(beneficiaryDTO);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}

}
