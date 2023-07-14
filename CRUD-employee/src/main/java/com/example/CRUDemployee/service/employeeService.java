package com.example.CRUDemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUDemployee.domain.employee;
import com.example.CRUDemployee.repository.employeeRepository;

@Service
public class employeeService {
	
	@Autowired
    private employeeRepository repo;
	
	public List<employee> listAll() {
        return repo.findAll();
    }
    
    public void save(employee emp) {
        repo.save(emp);
    }
    
    public employee get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}


