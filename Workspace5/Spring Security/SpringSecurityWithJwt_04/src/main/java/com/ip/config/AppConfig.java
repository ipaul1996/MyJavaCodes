package com.ip.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.ip.repository.CustomerRepo;

@Configuration
public class AppConfig {
	
	@Autowired
	private CustomerRepo cRepo;
	
	@Bean
	SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and()
			.addFilterBefore(new JwtTokenValidatorFilter(), BasicAuthenticationFilter.class)
			.addFilterAfter(new JwtTokenGeneratorFilter(cRepo), BasicAuthenticationFilter.class)
		    .authorizeHttpRequests()
		    .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()
			.requestMatchers(HttpMethod.POST, "/customers").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.and()
			.httpBasic();

		
		
		return http.build();
	}
	
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}
