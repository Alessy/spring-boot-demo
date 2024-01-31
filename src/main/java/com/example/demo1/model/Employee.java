package com.example.demo1.model;

import com.example.demo1.base.BaseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employee extends BaseModel<Integer> {

  private String firstName;

  private String lastName;

  private String emailId;


}

