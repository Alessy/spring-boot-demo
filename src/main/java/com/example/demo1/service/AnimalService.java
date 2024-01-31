package com.example.demo1.service;

import org.springframework.stereotype.Service;

import com.example.demo1.base.BaseService;
import com.example.demo1.model.Animal;
import com.example.demo1.repository.AnimalRepository;

@Service
public class AnimalService extends BaseService<Animal, Integer>{

  public AnimalService(AnimalRepository repository) {
    super(repository);
  }


}
