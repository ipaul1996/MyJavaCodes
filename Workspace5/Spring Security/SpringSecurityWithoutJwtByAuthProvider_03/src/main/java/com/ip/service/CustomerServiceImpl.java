package com.ip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ip.exception.CustomerException;
import com.ip.model.Customer;
import com.ip.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo cRepo;
	
	
	@Autowired
	private PasswordEncoder pEncoder;
	

	@Override
	public Customer registerCustomer(Customer customer) {
		
		customer.setPassword(pEncoder.encode(customer.getPassword()));
	
		return cRepo.save(customer);
	}

	@Override
	public Customer getCustomerDetailsByEmail(String email) throws CustomerException {
		
		return cRepo.findByEmail(email).orElseThrow(() -> new CustomerException("Invalid email Id"));
		
	}

	@Override
	public List<Customer> getAllCustomerDeatils() throws CustomerException {
		
		List<Customer> customers = cRepo.findAll();
		
		if(customers.isEmpty()) throw new CustomerException("No customer found");
		
		return customers;
	}

	
	@Override
	public Customer signIn(Authentication auth) {
		
		return cRepo.findByEmail(auth.getName()).get();

	}

}
