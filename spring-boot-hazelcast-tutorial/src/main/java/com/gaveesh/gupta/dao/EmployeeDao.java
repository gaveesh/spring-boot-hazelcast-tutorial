package com.gaveesh.gupta.dao;

import java.util.List;

import com.gaveesh.gupta.model.Employee;

public interface EmployeeDao {
		void insertEmployee(Employee cus);
		void insertEmployees(List<Employee> employees);
		List<Employee> getAllEmployees();
		Employee getEmployeeById(String empId);
}
