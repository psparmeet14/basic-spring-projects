package com.pslearning.spring.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pslearning.spring.database.databasedemo.bean.Person;
import com.pslearning.spring.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.retrieveAll());
		logger.info("User with id 10003 -> {}", dao.findById(10003));
		logger.info("Users with name Raj -> {}", dao.findByName("Raj"));
		logger.info("Deleting 10002 -> Number of rows deleted - {}", dao.deleteById(10002));
		logger.info("Inserting new user with id 10004 - {}", dao.insert(new Person(10004, "Parmeet", "Berlin", new Date())));
		logger.info("Updating user with id 10003 - {}", dao.update(new Person(10003, "Raj", "Morocco", new Date())));
	}

}
