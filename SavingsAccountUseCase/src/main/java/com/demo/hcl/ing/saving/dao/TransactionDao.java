package com.demo.hcl.ing.saving.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.hcl.ing.saving.entity.Transaction;

public interface TransactionDao extends JpaRepository<Transaction, Long> {

}
