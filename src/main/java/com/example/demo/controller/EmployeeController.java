package com.example.demo.controller;

import com.example.demo.entity.Employee;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/employee")
public interface EmployeeController {

    @GetMapping
    List<Employee> getAllEmployees();

    @GetMapping("/{name}")
    List<Employee> getAllEmployeesByName(@PathVariable("name") String name);

    @PostMapping("/add")
    Employee insertEmployee(@RequestBody Employee employee);

    @PutMapping("/update/{id}")
    Employee updateEmployeeById(@RequestBody Employee employee, @PathVariable("id") Long id);

    @DeleteMapping("/delete/all")
    void deleteAllEmployees();

    @GetMapping("/email/{email}")
    List<Employee> getByEmail(@PathVariable("email") String email);
}
