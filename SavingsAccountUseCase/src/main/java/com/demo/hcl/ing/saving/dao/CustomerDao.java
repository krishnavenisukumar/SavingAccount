package com.demo.hcl.ing.saving.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.hcl.ing.saving.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {
	
	
	@Query(value = "SELECT * FROM Customer c WHERE c.email_Address =:emailAddress and c.password =:password", 
			  nativeQuery = true)
	public Customer findByEmailAddressAndPassword(String emailAddress,String password);
	

}
