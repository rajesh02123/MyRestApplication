package com.rest.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.rest.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private static Map<Integer, Employee> employeeMap = 
			new HashMap<Integer, Employee>();
	
	static {
		employeeMap = getEmployeeMap();
	}
	
	public List<Employee> getAll(){
		return new ArrayList<Employee>(employeeMap.values());
	}
	
	public Employee getById(int employeeId) {
		return employeeMap.get(employeeId);
	}
	
	public void create(Employee employee) {
		employeeMap.put(employeeMap.size()+1, employee);
	}
	
	public void update(Employee employee) {
		employeeMap.put(employee.getId(), employee);
	}
	
	public void delete(Employee employee) {
		employeeMap.remove(employee.getId());
	}
	
	private static Map<Integer, Employee> getEmployeeMap(){
		Map<Integer, Employee> employees = 
				new HashMap<Integer, Employee>();
		
		employees.put(1, 
				new Employee(1, "lohith", "hyderabad"));
		
		employees.put(2, 
				new Employee(2, "mohith", "hyderabad"));
		
		employees.put(3, 
				new Employee(3, "rohith", "hyderabad"));
		
		return employees;
		
	}

}
