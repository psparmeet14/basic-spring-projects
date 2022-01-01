package com.pslearning.spring.basics.springin10steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
		
	public int binarySearch(int[] numbers, int numberToSearch) {
		
		// Implementing sorting logic
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search the element
		
		// return the index of the element
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstructBinarySearchImpl");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroyBinarySearchImpl");
	}

}
