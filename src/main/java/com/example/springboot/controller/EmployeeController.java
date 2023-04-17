package com.example.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeService;

@RestController
public class EmployeeController
{
	@Autowired
    private EmployeeService employeeService;
	
	@PostMapping("/add")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.save(employee);
		
	}
	
	@GetMapping("/employee/{employeeName}")
	 public Employee findByName( @PathVariable String employeeName)
     {
   	    return employeeService.findByName(employeeName);
     }
	
	 @GetMapping("/employee")
	 public List<Employee> getAllEmployees()
     {
   	  return employeeService.getAllEmployees();
     }
	 
	 @GetMapping("/employee1/{employeeSalary}")
	 public Employee findByemployeeSalary(@PathVariable double employeeSalary)
     {
   	  return employeeService.findByemployeeSalary(employeeSalary);
     }
	 
	 @GetMapping("/employee2/{employeeId}")
	 public Employee findByemployeeId(@PathVariable int employeeId)
     {
		Employee e1= employeeService.findByemployeeId(employeeId);
		System.out.println(e1);
		return e1;
		 
     }
	 
	 @GetMapping("/employee3/{employeeId}/{employeeSalary}")
	 public Employee getByEmployeeIdAndEmployeeSalary(@PathVariable int employeeId, @PathVariable double employeeSalary)
     {
   	   Employee e2= employeeService.getByEmployeeIdAndEmployeeSalary(employeeId, employeeSalary);
   	   System.out.println(e2);
   	   return e2;
   	   
     }
	 
	 @GetMapping("/employee4")
     public List<Employee> getsalaryBydesc()
     {
   	   List<Employee> list=employeeService.getsalaryBydesc();
   	   System.out.println(list);
   	   return list;
     }
	 
}
