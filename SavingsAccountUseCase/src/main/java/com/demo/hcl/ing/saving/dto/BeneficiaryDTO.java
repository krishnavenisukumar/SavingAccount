package com.demo.hcl.ing.saving.dto;

import com.demo.hcl.ing.saving.entity.Beneficiary;

public class BeneficiaryDTO {

	private Beneficiary beneficiary;

	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

	public BeneficiaryDTO() {
		super();
	}

	public BeneficiaryDTO(Beneficiary beneficiary) {
		super();
		this.beneficiary = beneficiary;
	}

	@Override
	public String toString() {
		return "BeneficiaryDTO [beneficiary=" + beneficiary + "]";
	}
	
}
