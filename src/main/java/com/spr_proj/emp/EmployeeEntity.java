package com.spr_proj.emp;

import jakarta.persistence.Entity; //J2EE
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //generates getters and setters no  need to write getter setters func
@Entity //An entity is an object about which data is to be captured
@Table(name="emp_db")//creates new table named emp db
public class EmployeeEntity {

  @Id //Primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY) //TO auto generate id
  private Long id;

  private String name; // since these are private we need public getter setter func to access it in other files 
  private String phone;
  private String email;
}
