package com.demo.hcl.ing.saving.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.hcl.ing.saving.entity.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
