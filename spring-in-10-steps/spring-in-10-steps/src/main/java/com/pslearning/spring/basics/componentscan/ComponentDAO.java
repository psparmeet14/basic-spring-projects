package com.pslearning.spring.basics.componentscan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentDAO {
	
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	@PostConstruct
	public void postConstructComponentDAO() {
		System.out.println("postConstructComponentDAO");
	}
	
	@PreDestroy
	public void preDestroyComponentDAO() {
		System.out.println("preDestroyComponentDAO");
	}
	
}
