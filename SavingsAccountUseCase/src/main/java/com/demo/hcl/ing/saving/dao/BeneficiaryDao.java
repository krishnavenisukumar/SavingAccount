package com.demo.hcl.ing.saving.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.hcl.ing.saving.entity.Beneficiary;

@Repository
public interface BeneficiaryDao extends JpaRepository<Beneficiary, Long> {

	
	List<Beneficiary> findByCustomerAccountNumber(Long customerAccountNumber);
}
