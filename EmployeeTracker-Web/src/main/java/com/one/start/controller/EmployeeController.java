package com.one.start.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.start.model.Employee;
import com.one.start.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;

	@RequestMapping("/")
	public String dashboard() {

		System.out.println("At home");
		return "Employee";
	}

	/*
	 * @RequestMapping("/addEmployee") public String addEmployee(Employee employee)
	 * {
	 * 
	 * System.out.println("Inside add employee"); empRepo.save(employee);
	 * 
	 * System.out.println("Employee" + employee.getEmpName() +
	 * "Saved successfully"); return "Employee"; }
	 */

	@RequestMapping("/fetchEmployee")
	public String fetchEmployee(@RequestParam int eid) {

		System.out.println("Inside add fetch employee");
		Employee employee = empRepo.findById(eid).orElse(new Employee());

		System.out.println(employee + "     fetched ");
		return "Employee";
	}
	
	@RequestMapping("/fetchEmployeeByName")
	public String fetchEmployeeByName(@RequestParam String empName) {
		
		System.out.println("Inside add fetch employee by name");

		List<Employee> employeeList = empRepo.findByempName(empName);

		
		for(Employee em : employeeList) {
			System.out.println(em + "     fetched ");
		}
		
		
		return "Employee";
	}
	
	@RequestMapping("/fetchEmployeeByProject")
	public String fetchEmployeeByProject(@RequestParam String projectName) {
		
		System.out.println("Inside add fetch employee by project");

		List<Employee> employeeList = empRepo.findByprojectName(projectName);

		
		for(Employee em : employeeList) {
			System.out.println(em + "     fetched ");
		}
		
		
		return "Employee";
	}
	
	@RequestMapping("/fetchEmployeeGreaterThan")
	public String fetchEmployeeGreaterThan(@RequestParam int input) {
		
		System.out.println("Inside add fetchEmployeeGreaterThan");

		List<Employee> employeeList = empRepo.findByeidGreaterThan(input);

		
		for(Employee em : employeeList) {
			System.out.println(em + "     fetched ");
		}
		
		
		return "Employee";
	}
	
	
	@RequestMapping("/fetchEmployeeByProjectSorted")
	public String fetchEmployeeByProjectSorted(@RequestParam String projectName) {
		
		System.out.println("Inside add fetchEmployeeByProjectSorted");

		List<Employee> employeeList = empRepo.findByProjectSorted(projectName);

		
		for(Employee em : employeeList) {
			System.out.println(em + "     fetched ");
		}
		
		
		return "Employee";
	}
	
	// ResponseBody Impl
	@RequestMapping("/fetchAllEmployee")
	@ResponseBody
	public List<Employee> fetchAllEmployee() {

		System.out.println("Inside add fetch all employee");
		
		
		return empRepo.findAll();
	}
	
	// @ PathVariable
	@RequestMapping(path = "/getEmployee/{eid}" ,produces = {"application/json"})
	@ResponseBody
	public Optional<Employee> getEmployee(@PathVariable("eid") int id) {

		System.out.println("Inside add fetch all employee");
		
		
		return empRepo.findById(id);
	}
	
	
	@PostMapping("/addEmployee")
	@ResponseBody
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return (Employee) empRepo.save(employee);
	}
	
	@PutMapping("/addEmployee")
	@ResponseBody
	public Employee addEmployeePut(@RequestBody Employee employee) {
		
		return (Employee) empRepo.save(employee);
	}
	
}
