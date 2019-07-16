package com.muhiza.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.muhiza.model.Book;
import com.muhiza.model.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Department department) {
		sessionFactory.getCurrentSession().save(department);
		return department.getId();
	}

	@Override
	public Department get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> list() {
		List<Department> list = sessionFactory.getCurrentSession().createQuery("from Department").list();
		return list;
	}

	@Override
	public void update(long id, Department department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
