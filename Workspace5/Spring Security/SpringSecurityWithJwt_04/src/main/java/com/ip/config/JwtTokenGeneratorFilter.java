package com.ip.config;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.ip.model.Customer;
import com.ip.repository.CustomerRepo;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtTokenGeneratorFilter extends OncePerRequestFilter{
	
	@Autowired
	private final CustomerRepo cRepo;
	
	public JwtTokenGeneratorFilter(CustomerRepo cRepo) {
		this.cRepo = cRepo;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		Authentication authentication =  SecurityContextHolder.getContext().getAuthentication();
		
		
		Customer customer = cRepo.findByEmail(authentication.getName()).get();
		
		if(authentication != null) {
			
			SecretKey key = Keys.hmacShaKeyFor(SecurityConstants.JWT_KEY.getBytes());
			
			String jwt = Jwts.builder()
								.setHeaderParam("typ", "JWT")
								.setHeaderParam("alg", "HS512")
								.setIssuer("IP")
								.setSubject(authentication.getName())
								.claim("name", customer.getName())
								.claim("authorities", populateAuthorities(authentication.getAuthorities()))
								.setIssuedAt(new Date())
								.setExpiration(new Date(new Date().getTime() + 30000000))  // expiration time of 8 hours //30000000 is in ms
								.signWith(key).compact();
			
			
			response.setHeader(SecurityConstants.JWT_HEADER, jwt);
			
		}
		
		filterChain.doFilter(request, response);
		
		
		
	}
	
	private String populateAuthorities(Collection<? extends GrantedAuthority> collection) {
		
		Set<String> authoritiesSet = new HashSet<>();
		
		for(GrantedAuthority authority : collection) {
			authoritiesSet.add(authority.getAuthority());
		}
		
		return String.join(",", authoritiesSet);
	}
	
	@Override
	protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
		return !request.getServletPath().equals("/signIn");	
	}

	
}
