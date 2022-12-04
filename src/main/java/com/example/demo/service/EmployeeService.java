package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee insertEmployee(Employee employee);

	Employee updateEmployeeById(Employee employee, Long id);

	void deleteAllEmployees();

	List<Employee> getAllEmployeesByName(String name);

	List<Employee> getByEmail(String email);
}
