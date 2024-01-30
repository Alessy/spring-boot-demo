package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

  // public Employee findByLastName(String lastname);
  
}
