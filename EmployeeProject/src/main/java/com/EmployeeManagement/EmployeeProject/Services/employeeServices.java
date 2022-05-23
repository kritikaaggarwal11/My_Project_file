package com.EmployeeManagement.EmployeeProject.Services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmployeeManagement.EmployeeProject.Demo.employeeRepository;
import com.EmployeeManagement.EmployeeProject.pojo.employeeprg;

@Component
public class employeeServices {

	@Autowired
	public employeeRepository emp;
	
	public Optional<employeeprg> repo(int id) {
		Optional<employeeprg> empprogram =emp.findById(id);
		
		return empprogram;
	}
	//Sorting in descending order
	public List<employeeprg> getAll(){
		List<employeeprg> L=(List<employeeprg>) this.emp.findAll();
		Collections.sort(L, (d1,d2) -> Double.compare(d2.getSalary(),d1.getSalary()));
		return L;
	}
	 
	public employeeprg update(employeeprg prg) {
		employeeprg old=null;
		Optional<employeeprg> obj1=emp.findById((int) prg.getId());
		
		old=obj1.get();
		old.setSalary(prg.getSalary());
		emp.save(old);
		
		return old;
	}
}
