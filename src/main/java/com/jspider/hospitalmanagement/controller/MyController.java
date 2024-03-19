package com.jspider.hospitalmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jspider.hospitalmanagement.dto.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class MyController {

	@GetMapping("/")
	public String loadIndex() {
		return "index.html";
	}

	@GetMapping("/login")
	public String loadLogin() {
		return "login.html";
	}

	@GetMapping("/signup")
	public String loadSignup() {
		return "signup.html";
	}

	@GetMapping("/home")
	public String loadHome() {
		return "home.html";
	}

	@GetMapping("/project")
	public String loadProject() {
		return "project.html";
	}

	@GetMapping("/contact")
	public String loadContact() {
		return "contact.html";
	}

	@PostMapping("/connect")
	// @ResponseBody
	public String connects( @Validated Customer customer, BindingResult result) {
		// return customer;

		if(result.hasErrors()){
			return "signup.html";
		}
		else{
			return "login.html";
		}
	}

}
