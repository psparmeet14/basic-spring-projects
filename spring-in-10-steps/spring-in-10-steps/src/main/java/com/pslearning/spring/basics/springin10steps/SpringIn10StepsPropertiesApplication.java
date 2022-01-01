package com.pslearning.spring.basics.springin10steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.pslearning.spring.basics.springin10steps.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn10StepsPropertiesApplication {

	public static void main(String[] args) {
		
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsPropertiesApplication.class))
		{
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			System.out.println(service.returnServiceUrl());
		}
	
	}
   
}
