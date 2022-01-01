package com.pslearning.spring.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pslearning.spring.database.databasedemo.entity.Person;
import com.pslearning.spring.database.databasedemo.jdbc.PersonJdbcDao;
import com.pslearning.spring.database.databasedemo.jpa.PersonJpaRepository;
import com.pslearning.spring.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User with id 10003 -> {}", repository.findById(10003));
		logger.info("Inserting new user - {}", repository.save(new Person("Parmeet", "Berlin", new Date())));
		logger.info("Updating user with id 10003 - {}", repository.save(new Person(10003, "Pieter", "Morocco", new Date())));
		repository.deleteById(10002);
		logger.info("All users -> {}", repository.findAll());
	}

}
