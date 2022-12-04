package com.example.demo.service.serviceImpl;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Employee insertEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	@Transactional
	public Employee updateEmployeeById(Employee employee, Long id) {
		Optional<Employee> existingEmployee = employeeRepository.findById(id);

			if (existingEmployee.isPresent()) {
				Employee employee1 = existingEmployee.get();
				employee1.setEmail(employee.getEmail());
				employee1.setName(employee.getName());
				employeeRepository.save(employee1);
				return employee1;
			} else {
				employeeRepository.save(employee);
				return employee;
			}
	}

	@Override
	@Transactional
	public void deleteAllEmployees() {
		employeeRepository.deleteAll();
	}

	@Override
	public List<Employee> getAllEmployeesByName(String name) {
		return employeeRepository.findAllEmployeesByName(name);
	}

	@Override
	public List<Employee> getByEmail(String email) {
		return employeeRepository.findFirstEmployeeByEmail(email);
	}

}
