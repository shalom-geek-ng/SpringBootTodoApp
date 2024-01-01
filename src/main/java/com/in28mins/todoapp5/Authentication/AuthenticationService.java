package com.in28mins.todoapp5.Authentication;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean Authenticate(String name, String password) {
		boolean isEqualName = name.equalsIgnoreCase("Shalom");
		boolean isEqualPassword = name.equalsIgnoreCase("password");
		
		return isEqualName && isEqualPassword;
	}
}
