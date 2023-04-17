package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    public Employee findByemployeeName(String employeeName);
     
    public List<Employee> findAll();
    
    public Employee findByemployeeSalary(double employeeSalary);
    
    public Employee findByemployeeId(int employeeId);
    
    @Query( value = "select * from crudoperation.employee where employee_id=? and employee_salary=?;"
    		, nativeQuery = true)
    public Employee getByEmployeeIdAndEmployeeSalary(int employeeId, double employeeSalary);
    
    @Query(value = 
    	"select * from crudoperation.employee order by employee_salary desc",
    	 nativeQuery = true)
    public List<Employee> getsalaryBydesc();
    
}
