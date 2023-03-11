package com.ip.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.ip.model.Customer;
import com.ip.repository.CustomerRepo;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	private CustomerRepo cRepo;
	
	@Autowired
	private PasswordEncoder pEncoder;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		String username = authentication.getName();
		
		String password = authentication.getCredentials().toString();
		
		Optional<Customer> op = cRepo.findByEmail(username);
		
		if(op.isEmpty()) throw new BadCredentialsException("Invalid credentials");
		
		boolean flag = pEncoder.matches(password, op.get().getPassword());
		
		if(!flag) throw new BadCredentialsException("Invalid credentials");
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		return new UsernamePasswordAuthenticationToken(username, op.get().getPassword(), authorities);
	}

	
	@Override
	public boolean supports(Class<?> authentication) {
		
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
