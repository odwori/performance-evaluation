package com.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.department.entity.Department;


@RepositoryRestResource(path = "/departments")
public interface DepartmentRepository extends JpaRepository<Department, String> {

	Department save(Department department);

	void delete(String title);

	boolean exists(String title);

	Department findOne(String title);

	Iterable<Department> findAll();

}
