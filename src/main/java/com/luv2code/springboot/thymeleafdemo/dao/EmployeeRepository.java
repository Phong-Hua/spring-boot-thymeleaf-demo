package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// Add method to sort by lastName
	// Spring Data JPA will parse the method name
	// Looks for a specific format and pattern
	// And create appropriate query ... behind the scenes
	// read more at: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details
	public List<Employee> findAllByOrderByLastNameAsc();
}
