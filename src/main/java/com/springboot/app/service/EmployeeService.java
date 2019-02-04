package com.springboot.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.Employee;
import com.springboot.app.model.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	/*private List<Employee> li = new ArrayList <>( Arrays.asList(
			new Employee(1,"Abhishek","Pune"),
			new Employee(2,"Madhur","Banglore"),
			new Employee(3,"Shruti","Pune")
			));*/
	
	
	public List<Employee> getAllTopics()
	{
		
		List <Employee> li = new ArrayList<Employee>();
		employeerepository.findAll().forEach(li::add);
		return li;
	}

	public Employee getEmployee(int id)
	{
		 
		// return li.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		//employeerepository.
		return employeerepository.findById(id).get();
	}

	public void addEmployee(Employee emp) {
	  //li.add(emp);
	   employeerepository.save(emp)	;
	}

	public void updateEmployee(Integer id, Employee emp) {
		
		/*for(int i=0;i<li.size();i++)
		{
			Employee e=li.get(i);
			if(e.getId().equals(id))
			{
				li.set(i, emp);
				return;
			}
		}*/
		//Employee e=employeerepository.findById(id).get();
		employeerepository.save(emp);
	}

	public void deleteEmployee(Integer id) {
		
		//li.removeIf(t -> t.getId().equals(id));
		employeerepository.deleteById(id);
		
	}
}
