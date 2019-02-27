package com.muhiza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhiza.model.Employee;
import com.muhiza.services.EmployeeService;
@RestController

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/api/employees")
	public ResponseEntity<List<Employee>> list(){
		//sfwsfffwgwgwg
		//jbjbjbjbj
		List<Employee> list = employeeService.list();
		return ResponseEntity.ok().body(list); 
	}
}
