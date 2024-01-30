package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.Employee;
import com.example.demo1.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  public List<Employee> getAll(){
    return employeeRepository.findAll();
  }

  @Transactional
  public Employee create(Employee employee) {
    return employeeRepository.save(employee);
  }

  @Transactional
  public void delete(Integer id){
    employeeRepository.deleteById(id);
  }

  @Transactional
  public Employee update(Integer id, Employee employee) {
    Employee emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    
    emp.setFirstName(employee.getFirstName());
    emp.setLastName(employee.getLastName());
    emp.setEmailId(employee.getEmailId());

    return employeeRepository.save(emp);    
  }
}
