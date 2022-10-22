package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.patientEntity;
import com.example.service.patientService;

@RestController
@RequestMapping("/patients")
public class patientController {
	
	@Autowired
	private patientService patientService;
	
	@GetMapping
	public List<patientEntity> getPatient() {
		return patientService.getPatient();
	}

	@PostMapping
	public patientEntity savePatient(@RequestBody patientEntity patientEntity) {
		return patientService.addPatient(patientEntity);
		
	}
				
	@PutMapping("/{id}")
	public patientEntity updatePatientbyid(@PathVariable int id,@RequestBody patientEntity patientEntity) {
		return patientService.updatePatient(id, patientEntity);
	}

	@DeleteMapping("/{id}")
	public void deletePatientById(@PathVariable int id) {
		patientService.deletePatient(id);
	}
	
}
