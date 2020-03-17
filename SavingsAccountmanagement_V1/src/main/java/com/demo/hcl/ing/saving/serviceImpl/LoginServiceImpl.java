package com.demo.hcl.ing.saving.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hcl.ing.saving.dto.LoginRequestDTO;
import com.demo.hcl.ing.saving.dto.LoginResponseDTO;
import com.demo.hcl.ing.saving.entity.Customer;
import com.demo.hcl.ing.saving.exception.GeneralException;
import com.demo.hcl.ing.saving.repo.CustomerRepo;
import com.demo.hcl.ing.saving.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	
	private CustomerRepo customerRepo;

	@Override
	public Optional<LoginResponseDTO> login(LoginRequestDTO loginRequestDTO)throws GeneralException {
		
		Optional<Customer> loginResponse=customerRepo.findByCustomerIdAndPassword(loginRequestDTO.getCustomerId(),loginRequestDTO.getPassword());
		if(!loginResponse.isPresent())
		{
			throw new GeneralException("login error");
		}
		LoginResponseDTO response=new LoginResponseDTO();
		response.setCustomerId(loginResponse.get().getCustomerId());
		return Optional.of(response);
	}

}
