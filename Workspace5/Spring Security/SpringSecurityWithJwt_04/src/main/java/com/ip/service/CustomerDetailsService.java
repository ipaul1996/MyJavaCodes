package com.ip.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.ip.model.Customer;
import com.ip.repository.CustomerRepo;

@Component
public class CustomerDetailsService implements UserDetailsService{
	
	@Autowired
	private CustomerRepo cRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Customer> op =  cRepo.findByEmail(username);
		
		if(op.isEmpty()) {
			throw new UsernameNotFoundException("Invalid credential");
			
		} 
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		return  new User(op.get().getEmail(), op.get().getPassword(),  authorities);
	}

	
	

}
