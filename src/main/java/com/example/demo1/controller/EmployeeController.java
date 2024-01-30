package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.Employee;
import com.example.demo1.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping()
  public List<Employee> getAll() {
      return employeeService.getAll();
  }

  @PostMapping()
  public Employee create(@RequestBody Employee employee) {
      return employeeService.create(employee);
  }

  @PutMapping("/{id}")
  public Employee putMethodName(@PathVariable Integer id, @RequestBody Employee employee) {
      //TODO: process PUT request
      
      return employeeService.update(id, employee);
  }
  
  @DeleteMapping("/{id}")
  public void delete(@PathVariable Integer id){
    employeeService.delete(id);
  }
  
  
}
