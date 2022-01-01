package com.pslearning.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pslearning.spring.basics.springin10steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn10StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsScopeApplication.class);

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsScopeApplication.class))
		{
			PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);
		
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
			
			LOGGER.info("{}", personDao1);
			LOGGER.info("{}", personDao1.getJdbcConnection());
		}
	}
   
}
