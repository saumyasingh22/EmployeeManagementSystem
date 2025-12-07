package com.spr_proj.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.delivery.request"})  //added due to error through autowired new object was not recognized it happens if the app is broken in different modules
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.delivery. repository")
//@ComponentScan(basePackageClasses = EmpController.class)
public class EmpApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmpApplication.class, args);
	}
}


//User(Model)-> REST controller -> Service -> DAO (DB -> entity)