package com.spr_proj.emp;

import java.util.List;

public interface EmployeeService {  //abstract blueprint is made in interface later it will be implemented
  String createEmployee(Employee employee);
  List<Employee> readEmployees();
  boolean deleteEmployee(Long id);
  String updateEmployee(Long id, Employee employee);
  Employee readEmployee(Long id); 
}
