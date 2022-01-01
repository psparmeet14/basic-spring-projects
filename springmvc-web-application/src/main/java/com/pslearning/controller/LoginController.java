package com.pslearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pslearning.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (!loginService.validateUser(name, password)) {
			model.addAttribute("errorMessage", "Invalid credentials! Please try with valid credentials!");
			return "login";
		}

		model.addAttribute("name", name);
		model.addAttribute("password", password);
		return "welcome";
	}

}
