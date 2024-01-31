package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.base.BaseController;
import com.example.demo1.model.Animal;
import com.example.demo1.service.AnimalService;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/animals")
public class AnimalController extends BaseController<Animal, Integer>  {

  public AnimalController(AnimalService service) {
    super(service);
  }

}
