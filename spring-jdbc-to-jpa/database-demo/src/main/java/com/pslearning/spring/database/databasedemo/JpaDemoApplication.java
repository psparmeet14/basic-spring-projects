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

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
	
	/*
	 * JPA
	 * Maps application classes to database tables
	 * 
	 * Entities
	 * EntityManager
	 * Relationships
	 * Criteria API  -  to query the database
	 * JPQL  -  to query the database
	 * Mapping
	 * 
	 * @Entity
	 * @Table(name = "table_Name")
	 * @Id
	 * @GeneratedValue
	 * @Column(name = "column_name")
	 * @ManyToMany
	 * @OneToOne
	 * @OneToMany
	 * @ManyToOne
	 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
	 * @DiscriminatorColumn(name = "EMPLOYEE_TYPE")
	 * 
	 * @Transactional
	 * @PersistenceContext
	 * 
	 * 
	 * persist()
	 */
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User with id 10003 -> {}", repository.findById(10003));
		logger.info("Inserting new user - {}", repository.insert(new Person("Parmeet", "Berlin", new Date())));
		logger.info("Updating user with id 10003 - {}", repository.update(new Person(10003, "Pieter", "Morocco", new Date())));
		repository.deleteById(10002);
		logger.info("All users -> {}", repository.findAll());
	}

}
