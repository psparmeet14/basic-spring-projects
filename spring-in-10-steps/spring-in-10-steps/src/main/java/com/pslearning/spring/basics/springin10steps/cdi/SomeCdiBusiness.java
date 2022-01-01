package com.pslearning.spring.basics.springin10steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao cdiDao;

	public SomeCdiDao getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(SomeCdiDao cdiDao) {
		this.cdiDao = cdiDao;
	}

	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = cdiDao.getData();
		
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
