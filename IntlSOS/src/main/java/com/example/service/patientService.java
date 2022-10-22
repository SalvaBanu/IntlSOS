package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.patientRepository;
import com.example.entity.patientEntity;

@Service
public class patientService {
	
	@Autowired
	private patientRepository patientRepository;
	
	public List<patientEntity> getPatient() {
		return patientRepository.findAll();
	}

	public patientEntity addPatient(patientEntity patientEntity) {
		return patientRepository.save(patientEntity);
	}
	
	public patientEntity updatePatient(int id, patientEntity patientEntity) {
		patientEntity data = getPatientById(id);
	data.setPatientId(id);
	data.setDoctorId(patientEntity.getDoctorId());
	data.setPatientName(patientEntity.getPatientName());
	data.setAge(patientEntity.getAge());
	data.setGender(patientEntity.getGender());
	data.setPhoneNumber(patientEntity.getPhoneNumber());
	return patientRepository.save(data);
	}

   private patientEntity getPatientById(int id) {
		return patientRepository.findById(id);
	}

public void deletePatient(int id) {
	patientRepository.deleteById(id);
	   
   }
}

