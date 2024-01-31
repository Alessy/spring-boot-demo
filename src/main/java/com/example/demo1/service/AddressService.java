package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.Address;
import com.example.demo1.repository.AddressRepository;

import jakarta.transaction.Transactional;

@Service
public class AddressService {

  @Autowired
  private AddressRepository addressRepository;

  public List<Address> getAll(){
    return addressRepository.findAll();
  }

  @Transactional
  public Address create(Address address) {
    return addressRepository.save(address);
  }

  @Transactional
  public void delete(Integer id){
    addressRepository.deleteById(id);
  }

  @Transactional
  public Address update(Integer id, Address address) {
    Address emp = addressRepository.findById(id).orElseThrow(() -> new RuntimeException("Address not found with id: " + id));
    
    emp.setStreet(address.getStreet());
    emp.setHouseNum(address.getHouseNum());

    return addressRepository.save(emp);    
  }
}
