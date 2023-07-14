package com.example.CRUDemployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.CRUDemployee.domain.device;
import com.example.CRUDemployee.domain.employee;
import com.example.CRUDemployee.domain.project;
import com.example.CRUDemployee.repository.employeeRepository;
import com.example.CRUDemployee.repository.projectRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CrudEmployeeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudEmployeeApplication.class, args);
	}

	
	@Autowired
	private employeeRepository employeeRepository;
	
	@Autowired
	private projectRepository projectRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		 employee e1= new employee("john","jemail",23);
//
//		 device d2 =new device("samsung phone");
//		 device d3 =new device("lenova laptop");
//		 
//		 e1.getDevices().add(d2);
//		 e1.getDevices().add(d3);
//		 
//		 this.employeeRepository.save(e1);
		
		
//		employee e1= new employee("MtoM","Mmail",23);
//		project p1= new project("spring_project");
//		project p2= new project("java_project"); 
//		
//		e1.getProjects().add(p1);
//		e1.getProjects().add(p2);
//		
//		p1.getEmployees().add(e1);
//		p2.getEmployees().add(e1);
//		
//		this.employeeRepository.save(e1);
		
		
		
		  
//		
	}

}
