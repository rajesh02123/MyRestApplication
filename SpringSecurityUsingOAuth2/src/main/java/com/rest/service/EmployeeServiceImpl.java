package com.rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.EmployeeDao;
import com.rest.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getAllEmployee() {
		return employeeDao.getAll();
	}

	public Employee getEmployeeById(int employeeId) {
		return employeeDao.getById(employeeId);
	}

	public void createEmployee(Employee employee) {
		employeeDao.create(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeDao.update(employee);
	}

	public void deleteEmployee(Employee employee) {
		employeeDao.delete(employee);
	}

}
