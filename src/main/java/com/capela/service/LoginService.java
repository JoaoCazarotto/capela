package com.capela.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capela.model.Login;
import com.capela.repository.LoginRepository;

@Service
public class LoginService implements LoginServiceInterface {
		@Autowired
		private LoginRepository loginRepository;
		
		public void CadastraLogin(Login l) {
			loginRepository.saveAndFlush(l);
		}
}
