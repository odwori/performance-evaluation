package com.muhiza.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.muhiza.model.Book;
import com.muhiza.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	
	@Autowired
	private SessionFactory sessionFactory; 
	
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
	public List<Employee> list() {
		List<Employee> list = sessionFactory.getCurrentSession().createQuery("from Employee").list();
		return list;
	}

	@Override
	public void update(long id, Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
