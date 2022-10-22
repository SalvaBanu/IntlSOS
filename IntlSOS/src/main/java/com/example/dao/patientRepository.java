package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.patientEntity;

@Repository
public interface patientRepository extends JpaRepository<patientEntity,Integer>{	

	public patientEntity findById(int id);
}
