package com.pslearning.spring.basics.springin10steps.cdi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {
	
	@InjectMocks
	SomeCdiBusiness business;
	
	@Mock
	SomeCdiDao dao;

	@Test
	void testBasicScenario() {
		when(dao.getData()).thenReturn(new int[] {10, 45, 90});
		int actualResult = business.findGreatest();
		assertEquals(90, actualResult);
	}
	
	@Test
	void testBasicScenario_whenOneValue() {
		when(dao.getData()).thenReturn(new int[] { 20 });
		assertEquals(20, business.findGreatest());
	}
	
	@Test
	void testBasicScenario_whenNoData() {
		when(dao.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}

}
