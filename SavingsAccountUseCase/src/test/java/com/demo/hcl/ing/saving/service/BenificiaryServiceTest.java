package com.demo.hcl.ing.saving.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.hcl.ing.saving.dao.BeneficiaryDao;
import com.demo.hcl.ing.saving.entity.Beneficiary;

@RunWith(MockitoJUnitRunner.class)
public class BenificiaryServiceTest {

	@Mock
	BeneficiaryDao beneficiaryDao;

	@InjectMocks
	RegisterNewBeneficiaryImpl registerNewBeneficiary;

	Beneficiary beneficiary = null;

	@Before
	public void before() {
		beneficiary = new Beneficiary();
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
	public void testNewBeneficiary() {
		registerNewBeneficiary.saveBeneficiary(beneficiary);

	}

}
