package com.muhiza.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.muhiza.model.Employee;

public interface EmployeeDAO {
	
	
	// save the record
		long save(Employee employee);
		
		// get a single record
		Employee get(long id);
		
		// get all books records
		List<Employee> list();
		
		//update a book
		void update(long id, Employee book);
		
		// deleting a book
		
		void delete(long id);
}
