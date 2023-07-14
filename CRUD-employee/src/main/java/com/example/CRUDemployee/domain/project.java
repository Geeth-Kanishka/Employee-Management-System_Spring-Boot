package com.example.CRUDemployee.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class project {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title")
    private String title;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = { CascadeType.ALL },mappedBy = "projects")
    private Set<employee> employees = new HashSet<>();
    
    
    public project() {}
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public project(String title) {
		super();
		this.title = title;
	}


	public Set<employee> getEmployees() {
		return employees;
	}


	public void setEmployees(Set<employee> employees) {
		this.employees = employees;
	}

}
