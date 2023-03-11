package com.ip.service;

import java.util.List;

import org.springframework.security.core.Authentication;

import com.ip.exception.CustomerException;
import com.ip.model.Customer;

public interface CustomerService {
	
	public Customer registerCustomer(Customer customer);
	
	
	public Customer getCustomerDetailsByEmail(String email) throws CustomerException;
	
	
	public List<Customer> getAllCustomerDeatils() throws CustomerException;
	
	
	public Customer signIn(Authentication auth);

}
