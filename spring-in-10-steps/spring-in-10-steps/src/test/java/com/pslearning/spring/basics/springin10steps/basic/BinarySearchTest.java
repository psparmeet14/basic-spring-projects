/**
 * 
 */
package com.pslearning.spring.basics.springin10steps.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.pslearning.spring.basics.springin10steps.SpringIn10StepsBasicApplication;

// Load the context
@ContextConfiguration(classes=SpringIn10StepsBasicApplication.class)
@ExtendWith(SpringExtension.class)
class BinarySearchTest {
	
	// Get the bean from the context
	@Autowired
	BinarySearchImpl binarySearchImpl;

	@Test
	void testBasicScenario() {
		assertEquals(3, binarySearchImpl.binarySearch(new int[] {}, 5));
	}

}
