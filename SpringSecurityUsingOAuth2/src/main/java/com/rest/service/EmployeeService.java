package com.rest.service;

import java.util.List;

import com.rest.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	Employee getEmployeeById(final int employeeId);
	void createEmployee(final Employee employee);
	void updateEmployee(final Employee employee);
	void deleteEmployee(final Employee employee);
	
}
