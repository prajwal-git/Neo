package com.one.start.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.one.start.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>

{
	List<Employee> findByempName(String empName);
	
	List<Employee> findByprojectName(String projectName);
	
	List<Employee> findByeidGreaterThan(int eid);
	
	@Query("from Employee where projectName = ?1 order by empName")
	List<Employee> findByProjectSorted(String projectName);
	
}
