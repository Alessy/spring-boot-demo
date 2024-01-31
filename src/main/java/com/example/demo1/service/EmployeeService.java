package com.example.demo1.service;

import org.springframework.stereotype.Service;

import com.example.demo1.base.BaseService;
import com.example.demo1.model.Employee;
import com.example.demo1.repository.EmployeeRepository;

@Service
public class EmployeeService extends BaseService<Employee, Integer>{

  public EmployeeService(EmployeeRepository repository) {
    super(repository);
  }


}
