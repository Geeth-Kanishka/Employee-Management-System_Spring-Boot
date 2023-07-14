package com.example.CRUDemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.CRUDemployee.domain.project;

@Repository
public interface projectRepository extends JpaRepository<project, Long> {

}
