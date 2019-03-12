package com.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javassist.tools.web.BadHttpRequest;

import com.department.entity.*;
import com.department.repository.*;


public class DepartmentController {

	@Autowired
    private DepartmentRepository repository;

    @GetMapping
    public Iterable<Department> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{title}")
    public Department find(@PathVariable("title") String title) {
        return repository.findOne(title);
    }

    @PostMapping(consumes = "application/json")
    public Department create(@RequestBody Department department) {
        return repository.save(department);
    }

    @DeleteMapping(path = "/{title}")
    public void delete(@PathVariable("title") String title) {
        repository.delete(title);
    }

    @PutMapping(path = "/{title}")
    public Department update(@PathVariable("title") String username, @RequestBody Department department) throws BadHttpRequest {
        if (repository.exists(title)) {
            department.setTitle(title);
            return repository.save(department);
        } else {
            throw new BadHttpRequest();
        }
    }
}
