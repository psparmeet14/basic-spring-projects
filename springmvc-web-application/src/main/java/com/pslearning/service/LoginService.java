package com.pslearning.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String name, String password) {
		return name.equals("psparmeet") && password.equals("x");
	}
}
