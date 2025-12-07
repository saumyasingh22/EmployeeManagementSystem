package com.spr_proj.emp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //generates getters and setters no  need to write getter setters func
@NoArgsConstructor //For constructors
@AllArgsConstructor
public class Employee {
  private Long id;
  private String name; // since these are private we need public getter setter func to access it in other files 
  private String phone;
  private String email;
}






  /*public String getName(){
    return name;
  }

  public void setName(String name){
    this.name=name;
  }

  public String getPhone(){
    return phone;
  }

  public void setPhone(String phone){
    this.phone=phone;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email=email;
  }*/

