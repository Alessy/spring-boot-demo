package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.base.BaseController;
import com.example.demo1.model.Employee;
import com.example.demo1.service.EmployeeService;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/employees")
public class EmployeeController extends BaseController<Employee, Integer>  {

  public EmployeeController(EmployeeService service) {
    super(service);
  }

}
