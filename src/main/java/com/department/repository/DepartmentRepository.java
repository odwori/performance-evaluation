package com.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "/departments")
public interface DepartmentRepository extends JpaRepository<Department, String> {

}
