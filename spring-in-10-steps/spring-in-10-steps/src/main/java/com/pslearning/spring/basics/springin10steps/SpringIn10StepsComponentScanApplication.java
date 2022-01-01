package com.pslearning.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pslearning.spring.basics.componentscan.ComponentDAO;
import com.pslearning.spring.basics.springin10steps.scope.PersonDAO;

@Configuration
@ComponentScan({"com.pslearning.spring.basics.componentscan", "com.pslearning.spring.basics.springin10steps"})
public class SpringIn10StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsComponentScanApplication.class);

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsComponentScanApplication.class))
		{
			ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
			
			LOGGER.info("{}", componentDAO);
			LOGGER.info("{}", personDAO);
		}
	}
   
}
