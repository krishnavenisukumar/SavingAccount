package com.demo.hcl.ing.saving.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hcl.ing.saving.dao.BeneficiaryDao;
import com.demo.hcl.ing.saving.entity.Beneficiary;

@Service
public class RegisterNewBeneficiaryImpl implements RegisterNewBeneficiary {

	@Autowired
	BeneficiaryDao beneficiaryDao;
	
	
	@Override
	public Beneficiary saveBeneficiary(Beneficiary beneficiary) {
		System.out.println("in Service Beneficiary before saving "+ beneficiary );
		beneficiaryDao.save(beneficiary);
		
	return beneficiary;
		
	}
	
	

}
