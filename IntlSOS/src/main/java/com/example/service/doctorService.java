package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.doctorRepository;
import com.example.entity.doctorEntity;

@Service
public class doctorService {
	
	@Autowired
	private doctorRepository doctorRepository;
	
	public List<doctorEntity> getDoctor() {
		return doctorRepository.findAll();
	}

	public doctorEntity addDoctor(doctorEntity doctorEntity) {
		return doctorRepository.save(doctorEntity);
	}
	
	public doctorEntity updateDoctor(int id, doctorEntity doctorEntity) {
	doctorEntity data = getDoctorById(id);
	data.setDoctorId(id);
	data.setFirstName(doctorEntity.getFirstName());
	data.setLastName(doctorEntity.getLastName());
	data.setAge(doctorEntity.getAge());
	data.setDepartment(doctorEntity.getDepartment());
	return doctorRepository.save(data);
	}

   private doctorEntity getDoctorById(int id) {
		return doctorRepository.findById(id);
	}

public void deleteDoctor(int id) {
	   doctorRepository.deleteById(id);
	   
   }
}

