package com.example.employee_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_management.Service.EmployeeService;
import com.example.employee_management.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	 private final EmployeeService service;

	    public EmployeeController(EmployeeService service) {
	        this.service = service;
	    }

	    @GetMapping
	    public List<Employee> getAll() {
	        return service.getAll();
	    }

	    @GetMapping("/{id}")
	    public Employee getById(@PathVariable Long id) {
	        return service.getById(id);
	    }

	    @GetMapping("/department/{dept}")
	    public List<Employee> getByDepartment(@PathVariable String dept) {
	        return service.getByDepartment(dept);
	    }

	    @PostMapping
	    public Employee create(@RequestBody Employee emp) {
	        return service.create(emp);
	    }

	    @PutMapping("/{id}")
	    public Employee update(@PathVariable Long id, @RequestBody Employee emp) {
	        return service.update(id, emp);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
}
