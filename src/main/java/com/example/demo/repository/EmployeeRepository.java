package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findAllEmployeesByName(String name);

	@Query("from Employee where email =:email order by id desc")
	List<Employee> findFirstEmployeeByEmail(@Param("email") String email);
}
