package com.example.CRUDemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUDemployee.domain.device;

@Repository
public interface deviceRepository extends JpaRepository<device, Long>{

}
