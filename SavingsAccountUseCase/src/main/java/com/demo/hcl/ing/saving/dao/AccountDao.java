package com.demo.hcl.ing.saving.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.hcl.ing.saving.entity.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {
	
	Account  findByAccountNumber(Long accountNumber);

}
