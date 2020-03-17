package com.demo.hcl.ing.saving.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hcl.ing.saving.dto.LoginRequestDTO;
import com.demo.hcl.ing.saving.dto.LoginResponseDTO;
import com.demo.hcl.ing.saving.exception.GeneralException;
import com.demo.hcl.ing.saving.service.LoginService;

@RestController
@RequestMapping(name = "myprofile")
public class LoginController {
	
	
	@Autowired
	private LoginService loginservice;
	@PostMapping(name = "/login")
	public ResponseEntity<Optional<LoginResponseDTO>> login(@RequestBody LoginRequestDTO loginRequestDTO) throws GeneralException
	{
		Optional<LoginResponseDTO> loginResponse=loginservice.login(loginRequestDTO);
		if(!loginResponse.isPresent())
		{
			throw new GeneralException("login error");
		}
		loginResponse.get().setStatusCode(HttpStatus.OK.value());
		
		loginResponse.get().setStatusMessage("login successfully");
		return new ResponseEntity<>(loginResponse,HttpStatus.OK);
		
	}

}
