package com.societegeneral.service;

import java.util.List;

import com.societegeneral.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployeeDetails();
	
	public Employee createEmployee(Employee emp);
}
