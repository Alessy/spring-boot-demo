package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.Address;
import com.example.demo1.service.AddressService;

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
@RequestMapping("/adresses")
public class AddressController {

  @Autowired
  private AddressService addressService;

  @GetMapping()
  public List<Address> getAll() {
      return addressService.getAll();
  }

  @PostMapping()
  public Address create(@RequestBody Address address) {
      return addressService.create(address);
  }

  @PutMapping("/{id}")
  public Address putMethodName(@PathVariable Integer id, @RequestBody Address address) {
      return addressService.update(id, address);
  }
  
  @DeleteMapping("/{id}")
  public void delete(@PathVariable Integer id){
    addressService.delete(id);
  }
  
  
}
