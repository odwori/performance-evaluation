package com.muhiza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhiza.model.Department;
import com.muhiza.services.DepartmentService;




@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	//Get all departments
	@GetMapping("/api/departments")
	public ResponseEntity<List<Department>> list(){
		
		List<Department> list = departmentService.list();
		return ResponseEntity.ok().body(list); 
	}
}
