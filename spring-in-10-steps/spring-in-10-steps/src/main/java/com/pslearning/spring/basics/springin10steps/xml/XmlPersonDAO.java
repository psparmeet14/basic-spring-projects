package com.pslearning.spring.basics.springin10steps.xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class XmlPersonDAO {
	
	XmlJdbcConnection jdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return jdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	@PostConstruct
	public void postConstructPersonDAO() {
		System.out.println("postConstructXmlPersonDAO");
	}
	
	@PreDestroy
	public void preDestroyPersonDAO() {
		System.out.println("preDestroyXmlPersonDAO");
	}
	
}
