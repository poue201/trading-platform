package com.ab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ab.entities.Customer;
import com.ab.services.CustomerService;

@Controller
public class CustomerController {
	
	
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String register() {
		
		return "register";
		
}
	
	@PostMapping("/register")
	public String registerProcess(@ModelAttribute Customer customer, ModelMap model) {
		
		Customer registeredCustomer = this.customerService.registerCustomer(customer);
		//Customer customerWithId = this.customerService.selectCustomer(registeredCustomer.getUserName());
		//System.out.println("***********************************");
		//System.out.println(customerWithId.getCustomerId());
		if(registeredCustomer != null) {
			//model.addAttribute("session_customer", registeredCustomer);
			return "login";
		}
		else {
			return "reg_failure";
		}
	}	
	}
