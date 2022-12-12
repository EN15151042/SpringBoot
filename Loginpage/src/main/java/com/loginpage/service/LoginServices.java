package com.loginpage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.loginpage.model.Login;
import com.loginpage.repository.LoginRepository;
@Service
public class LoginServices {

	@Autowired
	private LoginRepository loginRepository;
	
	public Login login(String username,String password)
	{
		Login user = loginRepository.findByUsernameAndPassword(username, password);
		
		return user;
		
	}
	
}
