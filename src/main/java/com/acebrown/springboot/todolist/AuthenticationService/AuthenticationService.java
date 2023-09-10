package com.acebrown.springboot.todolist.AuthenticationService;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	
	public boolean authenticate(String name, String password) {
		
		boolean nameIsValid = name.equalsIgnoreCase("John");
		boolean passIsValid = password.equalsIgnoreCase("12345");
		
		return nameIsValid && passIsValid;
	}
	
}
