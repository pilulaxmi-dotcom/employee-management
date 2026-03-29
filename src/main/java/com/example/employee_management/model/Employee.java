package com.example.employee_management.model;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String email;
	    private String department;

	    // Default Constructor
	    public Employee() {
	    }

	    // Parameterized Constructor
	    public Employee(Long id, String name, String email, String department) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.department = department;
	    }

	    // Getter and Setter for id
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    // Getter and Setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for email
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    // Getter and Setter for department
	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }
	}
	

