package com.pslearning.spring.basics.springin10steps;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pslearning.spring.basics.springin10steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn10StepsBasicApplication {

	/*
	 * Understand tight coupling and dependency injection
	 * Making the code loosely coupled
	 */
	
	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => no need
	
	/*
	 * @Component
	 * @Service
	 * @Repository
	 * @Controller
	 * @Scope  -- ConfigurableBeanFactory.SCOPE_SINGLETON/SCOPE_PROTOTYPE  & proxyMode=ScopedProxyMode.TARGET_CLASS
	 * @PropertySource
	 * @Autowired 
	 * @Primary  -  if you have more than one component matching a specific type, then we can go for @Primary annotation for that dependency/component that we want spring to autowire
	 * @Qualifier
	 * @PostConstruct
	 * @PreDestroy
	 * 
	 * SpringBoot app
	 * @SpringBootApplication
	 * -- SpringApplication.run(SpringIn10StepsBasicApplication.class, args)
	 * @RestController
	 * @GetMapping("/books")
	 * 
	 * Spring app
	 * @Configuration
	 * @ComponentScan
	 * -- new AnnotationConfigApplicationContext(SpringIn10StepsBasicApplication.class)
	 * 
	 * UnitTests
	 * @ContextConfiguration
	 * @ExtendWith
	 */
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		// Application Context
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsBasicApplication.class))
		{
			System.out.println("BEANS -> "+Arrays.toString(applicationContext.getBeanDefinitionNames()));
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			
			int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
			System.out.println(result);
		}
	
	}
   
}
