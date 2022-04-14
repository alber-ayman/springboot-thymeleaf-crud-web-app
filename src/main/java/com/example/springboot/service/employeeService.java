package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.Employee;


public interface employeeService {

	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(Long id);
	void deleteEmployeeById(Long id);
}
