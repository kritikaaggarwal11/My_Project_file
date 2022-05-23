package com.EmployeeManagement.EmployeeProject.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class employeeprg {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	double salary;
	String desg;
	
	employeeprg() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public employeeprg(int id, String desg, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "employeeprg [id=" + id + ", name=" + name + ", salary=" + salary + ", desg=" + desg + "]";
	}
	
}
