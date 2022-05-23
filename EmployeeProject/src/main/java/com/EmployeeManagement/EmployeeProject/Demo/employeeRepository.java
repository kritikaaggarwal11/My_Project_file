package com.EmployeeManagement.EmployeeProject.Demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.EmployeeProject.pojo.employeeprg;

public interface employeeRepository extends JpaRepository<employeeprg, Integer> {

}
