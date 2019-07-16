package com.muhiza.dao;

import java.util.List;

import org.hibernate.Session;
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
		Session session = sessionFactory.getCurrentSession();
		Department oldDepartment = session.byId(Department.class).load(id);
		oldDepartment.setDepartment_name(department.getDepartment_name());
		oldDepartment.setDepartment_description(department.getDepartment_description());
		session.flush();
	}

	@Override
	public void delete(long id) {
		
		Session session = sessionFactory.getCurrentSession();
		Department department = session.byId(Department.class).load(id);
		session.delete(department);
	}

}
