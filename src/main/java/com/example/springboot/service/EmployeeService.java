package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.Employee;
import com.example.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
      public void save(Employee employee)
      {
    	  employeeRepository.save(employee);
      }
      
      public Employee findByName(String employeeName)
      {
    	  return employeeRepository.findByemployeeName(employeeName);
      }
      
      public List<Employee> getAllEmployees()
      {
    	  return employeeRepository.findAll();
      }
      
      public Employee findByemployeeSalary(double employeeSalary)
      {
    	  return employeeRepository.findByemployeeSalary(employeeSalary);
      }
      
      public Employee findByemployeeId(int employeeId)
      {
    	  return employeeRepository.findByemployeeId(employeeId);
      }
      
      public Employee getByEmployeeIdAndEmployeeSalary(int employeeId, double employeeSalary)
      {
    	  return employeeRepository.getByEmployeeIdAndEmployeeSalary(employeeId, employeeSalary);
      }
      
      public List<Employee> getsalaryBydesc()
      {
    	  return employeeRepository.getsalaryBydesc();
      }
}
