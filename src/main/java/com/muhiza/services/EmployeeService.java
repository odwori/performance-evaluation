package com.muhiza.services;

import java.util.List;

import com.muhiza.model.Employee;

public interface EmployeeService {
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
