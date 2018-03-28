package com.rest.dao;

import java.util.List;

import com.rest.model.Employee;

public interface EmployeeDao {
	
	List<Employee> getAll();
	Employee getById(int employeeId);
	void create(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	

}
