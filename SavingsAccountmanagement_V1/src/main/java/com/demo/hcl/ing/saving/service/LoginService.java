package com.demo.hcl.ing.saving.service;

import java.util.Optional;

import com.demo.hcl.ing.saving.dto.LoginRequestDTO;
import com.demo.hcl.ing.saving.dto.LoginResponseDTO;
import com.demo.hcl.ing.saving.exception.GeneralException;

public interface LoginService {
	public Optional<LoginResponseDTO> login(LoginRequestDTO loginRequestDTO)throws GeneralException;

}
