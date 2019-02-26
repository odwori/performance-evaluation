package com.muhiza.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muhiza.dao.EmployeeDAO;
import com.muhiza.model.Employee;

@Service 
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public long save(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	@Transactional
	public List<Employee> list() {

		return employeeDAO.list();
	}

	@Override
	public void update(long id, Employee book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
