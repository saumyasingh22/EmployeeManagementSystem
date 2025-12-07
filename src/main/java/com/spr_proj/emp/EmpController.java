package com.spr_proj.emp;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmpController{
  
  //List<Employee> employees = new ArrayList<>(); //no implementation required in controller
  // EmployeeService employeeService = new EmployeeServiceImp(); //created new class to implement service layer interface functions // replaced with DI

  //dependency injection through IOC since we need same memory we do not need to create new object again and again thorugh new keyword
  @Autowired
  EmployeeService employeeService;

  @GetMapping("employees")
  public List<Employee> getAllEmployees() {
      return employeeService.readEmployees();
  }

  @GetMapping("employees/{id}")
  public Employee getEmployeeById(@PathVariable Long id) {
      return employeeService.readEmployee(id);
  }

  @PostMapping("employees")
  public String createEmployee(@RequestBody Employee employee) {
      //employees.add(employee); //because controller is not responsible for implementation service layer is
      return employeeService.createEmployee(employee);
  }
  
  @DeleteMapping("employees/{id}")
  public String deleteEmployee(@PathVariable Long id){
    if(employeeService.deleteEmployee(id)) return "Delete success";
    else return "not success";
  }

  @PutMapping("employees/{id}")
  public String putMethodEmployee(@PathVariable Long id, @RequestBody Employee employee){
    return employeeService.updateEmployee(id, employee);
  }
}
