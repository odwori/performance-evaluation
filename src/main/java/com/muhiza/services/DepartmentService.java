package com.muhiza.services;

import java.util.List;

import com.muhiza.model.Department;

public interface DepartmentService {
	
	//save department
		long save(Department department);
		
		//get single department record
		Department get(long id);
		
		//get all records
		List<Department> list();
		
		//update a department
		void update(long id, Department department);
			
		// deleting a department
		void delete(long id);

}
