package com.demo.hcl.ing.saving.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.hcl.ing.saving.entity.Account;


@Repository
public interface AccountRepo extends JpaRepository<Account, String> {

}
