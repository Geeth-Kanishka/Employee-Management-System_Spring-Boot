package com.example.CRUDemployee.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class employee {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;
    
    @ManyToMany(fetch=FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Employee_Project", 
        joinColumns = { @JoinColumn(name = "employee_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "project_id") }
    )
    Set<project> projects = new HashSet<>();
    
    public Set<project> getProjects() {
		return projects;
	}
	public void setProjects(Set<project> projects) {
		this.projects = projects;
	}
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fid",referencedColumnName = "id")
    List<device> devices = new ArrayList<>();
    
	public List<device> getDevices() {
		return devices;
	}
	public void setDevices(List<device> devices) {
		this.devices = devices;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee( String name, String email, int age) {
		super();

		this.name = name;
		this.email = email;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    
	

}
