package com.example.employee_management.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee_management.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartment(String department);
}