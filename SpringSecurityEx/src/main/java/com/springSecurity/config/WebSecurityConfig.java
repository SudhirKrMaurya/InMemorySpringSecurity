package com.springSecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.err.println("default user ");
		// Used by the default implementation of authenticationManager() to attempt to obtain an AuthenticationManager.
		// add user for in memory Authentication
		auth.inMemoryAuthentication().withUser("sudhirkumar").password("{noop}9211420").roles("user");
		auth.inMemoryAuthentication().withUser("sudhir").password("{noop}s111").roles("user");
		//super.configure(auth);
	}

	
	
	
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * http.httpBasic();
	 * http.authorizeRequests().anyRequest().authenticated().and().httpBasic(); }
	 * 
	 */


}
