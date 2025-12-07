package com.spr_proj.emp;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{  
 //can create custom methods here
  //List<EmployeeEntity> findByName(String name);
  //thorugh JPA repo we got built in methods like //save, delete, finById, findAll -> empServiceImpl
} 
