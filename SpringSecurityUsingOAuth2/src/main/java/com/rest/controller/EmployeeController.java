package com.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.model.Employee;
import com.rest.service.EmployeeService;

@RestController
@RequestMapping("Application")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = {"/employees"} , produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployee(); 
	}
	
	@GetMapping(value = {"/employeeById/{id}"} , produces = {MediaType.APPLICATION_JSON_VALUE})
	public Employee getEmployeeById(@PathVariable("id") int employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}
	
	@PostMapping(value = {"/createEmployee"})
	public void createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
	}
	
	@PutMapping(value= {"/updateEmployee"} , produces = {MediaType.APPLICATION_JSON_VALUE})
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping(value = {"deleteEmployee"} , produces = {MediaType.APPLICATION_JSON_VALUE})
	public void deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);
	}
}
