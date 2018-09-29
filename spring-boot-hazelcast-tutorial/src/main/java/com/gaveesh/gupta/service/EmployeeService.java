package com.gaveesh.gupta.service;

import java.util.List;

import com.gaveesh.gupta.model.Employee;

public interface EmployeeService {

	void insertEmployee(Employee emp);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	void getEmployeeById(String empid);
}
