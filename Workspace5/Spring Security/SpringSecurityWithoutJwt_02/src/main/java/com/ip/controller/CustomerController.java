package com.ip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ip.exception.CustomerException;
import com.ip.model.Customer;
import com.ip.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cService;
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> registerCustomerHandler(@RequestBody Customer customer) {
		
		return new ResponseEntity<>(cService.registerCustomer(customer), HttpStatus.ACCEPTED);
		
	}

	@GetMapping("/customers/{email}")
	public ResponseEntity<Customer> getCustomerDetailsByEmailHandler(@PathVariable("email") String email) throws CustomerException {
		
		return new ResponseEntity<>(cService.getCustomerDetailsByEmail(email), HttpStatus.OK);
	}

	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomerDeatilsHandler() throws CustomerException {
		
		return new ResponseEntity<>(cService.getAllCustomerDeatils(), HttpStatus.OK);
	}
	
	
	@GetMapping("/signIn")
	public ResponseEntity<Customer> loginHandler(Authentication auth) {
		
		return new ResponseEntity<>(cService.signIn(auth), HttpStatus.OK);
	}


}








