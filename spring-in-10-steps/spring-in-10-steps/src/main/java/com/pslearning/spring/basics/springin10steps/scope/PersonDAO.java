package com.pslearning.spring.basics.springin10steps.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	@PostConstruct
	public void postConstructPersonDAO() {
		System.out.println("postConstructPersonDAO");
	}
	
	@PreDestroy
	public void preDestroyPersonDAO() {
		System.out.println("preDestroyPersonDAO");
	}
	
}
