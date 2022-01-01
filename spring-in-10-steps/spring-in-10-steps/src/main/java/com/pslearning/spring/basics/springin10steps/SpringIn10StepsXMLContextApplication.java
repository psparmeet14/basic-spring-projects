package com.pslearning.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pslearning.spring.basics.springin10steps.basic.BinarySearchImpl;
import com.pslearning.spring.basics.springin10steps.xml.XmlPersonDAO;


public class SpringIn10StepsXMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsXMLContextApplication.class);
	
	public static void main(String[] args) {
		
		
		try (ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml"))
		{
			LOGGER.info("Beans loaded initially -> {}", (Object)applicationContext.getBeanDefinitionNames());
			
			XmlPersonDAO xmlPersonDao = applicationContext.getBean(XmlPersonDAO.class);
			XmlPersonDAO xmlPersonDao2 = applicationContext.getBean(XmlPersonDAO.class);
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			
			LOGGER.info("{}", xmlPersonDao);
			LOGGER.info("{}",xmlPersonDao.getXmlJdbcConnection());
			
			LOGGER.info("{}", xmlPersonDao2);
			LOGGER.info("{}",xmlPersonDao2.getXmlJdbcConnection());
			
			LOGGER.info("Binary search bean in XML application context {}", binarySearch);
			
		}
	
	}
   
}
