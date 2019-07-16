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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Department get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Department> list() {
		return departmentDAO.list();
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
