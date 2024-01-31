package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.model.Address;

public interface AddressRepository  extends JpaRepository<Address, Integer>{

  // public Employee findByLastName(String lastname);
  
}
