package com.springboot.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.Employee;
import com.springboot.app.service.EmployeeService;

@RestController
public class ApplicationController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping("/list")
	public List<Employee> getList()
	{
			
		return employeeservice.getAllTopics();
	}
    
	@RequestMapping("/list/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		
		return employeeservice.getEmployee(id);	
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/list")
	public void addEmployee(@RequestBody Employee emp)
	{
		employeeservice.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/list/{id}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable Integer id)
	{
		employeeservice.updateEmployee(id,emp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/list/{id}")
	public void deleteEmployee(@PathVariable Integer id)
	{
		employeeservice.deleteEmployee(id);
	}
}
