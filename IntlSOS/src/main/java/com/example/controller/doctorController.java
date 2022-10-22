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

import com.example.entity.doctorEntity;
import com.example.service.doctorService;

@RestController
@RequestMapping("/doctors")
public class doctorController {
	
	@Autowired
	private doctorService doctorService;
	
	@GetMapping
	public List<doctorEntity> getDoctor() {
		return doctorService.getDoctor();
	}

	@PostMapping
	public doctorEntity saveDoctor(@RequestBody doctorEntity doctorEntity) {
		return doctorService.addDoctor(doctorEntity);
		
	}
				
	@PutMapping("/{id}")
	public doctorEntity updateDoctorbyid(@PathVariable int id,@RequestBody doctorEntity doctorEntity) {
		return doctorService.updateDoctor(id, doctorEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteDoctorById(@PathVariable int id) {
		doctorService.deleteDoctor(id);
	}
	
}
