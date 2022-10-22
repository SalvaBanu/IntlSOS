package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.doctorEntity;

@Repository
public interface doctorRepository extends JpaRepository<doctorEntity,Integer>{	

	public doctorEntity findById(int id);
}
