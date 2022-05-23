package com.EmployeeManagement.EmployeeProject.cotroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.EmployeeProject.Services.employeeServices;
import com.EmployeeManagement.EmployeeProject.pojo.employeeprg;

@RestController
public class emplyeeController {
	
	@Autowired
	private employeeServices emps;
	
	
	@GetMapping("/employeesalary")
	public List<employeeprg> getsalary(){
		
		List<employeeprg> L=emps.getAll();
		return L;	
	}
	
	@GetMapping("employeesalary/{id}")
	public Optional<employeeprg> emp2(@PathVariable("id") int id){
		Optional<employeeprg> obj2=emps.repo(id);
		return obj2;
		
	}
	
	@PutMapping("employee/update")
	public employeeprg update(@RequestBody employeeprg employeepojo) {
		return emps.update(employeepojo);
		
	}
}
