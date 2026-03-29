package com.example.employee_management.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_management.Repository.EmployeeRepository;
import com.example.employee_management.model.Employee;

@Service
public class EmployeeService {

	  private final EmployeeRepository repo;

	    public EmployeeService(EmployeeRepository repo) {
	        this.repo = repo;
	    }

	    public List<Employee> getAll() {
	        return repo.findAll();
	    }

	    public Employee getById(Long id) {
	        return repo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Employee not found"));
	    }

	    public Employee create(Employee emp) {
	        return repo.save(emp);
	    }

	    public Employee update(Long id, Employee updated) {
	        Employee emp = getById(id);
	        emp.setName(updated.getName());
	        emp.setEmail(updated.getEmail());
	        emp.setDepartment(updated.getDepartment());
	        return repo.save(emp);
	    }

	    public void delete(Long id) {
	        repo.deleteById(id);
	    }

	    public List<Employee> getByDepartment(String dept) {
	        return repo.findByDepartment(dept);
	    }
}
