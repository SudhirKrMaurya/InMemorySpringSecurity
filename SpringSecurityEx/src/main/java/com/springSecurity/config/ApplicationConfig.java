package com.springSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class ApplicationConfig {
	//actual config file  define a view resolver
	@Bean
	public ViewResolver viewResolver()
	{
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	viewResolver.setPrefix("WEB-INF/view/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
		
	}

}
