package com.example.demo.controller.controllerImpl;

import com.example.demo.controller.EmployeeController;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeControllerImpl implements EmployeeController {

	@Autowired
	private final EmployeeService employeeService;

	public EmployeeControllerImpl(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@Override
	public List<Employee> getAllEmployeesByName(String name) {
		return employeeService.getAllEmployeesByName(name);
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		return employeeService.insertEmployee(employee);
	}

	@Override
	public Employee updateEmployeeById(Employee employee, Long id) {
		return employeeService.updateEmployeeById(employee, id);
	}

	@Override
	public void deleteAllEmployees() {
		employeeService.deleteAllEmployees();
	}

	@Override
	public List<Employee> getByEmail(String email) {
		return employeeService.getByEmail(email);
	}
}
