package com.muhiza.services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.muhiza.dao.DepartmentDAO;
import com.muhiza.model.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Override
	public long save(Department department) {
		return departmentDAO.save(department);
	}

	@Override
	@Transactional
	public Department get(long id) {
		return departmentDAO.get(id);
	}

	@Override
	@Transactional
	public List<Department> list() {
		return departmentDAO.list();
	}

	@Override
	@Transactional
	public void update(long id, Department department) {
		departmentDAO.update(id, department);
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
