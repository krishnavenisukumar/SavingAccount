package com.demo.hcl.ing.saving.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.hcl.ing.saving.entity.Transaction;


@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
	

}

