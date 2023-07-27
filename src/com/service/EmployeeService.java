package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee e);
	void deleteEmployee(int id);
	List<Employee> getAllEmployee();
}
