package com.example.adresseexoback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adresseexoback.domain.Person;
import com.example.adresseexoback.repo.PersonRepo;

@CrossOrigin
@RestController
@RequestMapping("/v1/api/person")
public class PersonController {

	
	@Autowired
	PersonRepo personRepo;
	
	@PostMapping
	public ResponseEntity<Person> createPerson(@RequestBody Person person) {
		return ResponseEntity.ok(personRepo.save(person));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Person>> getAll() {
		return ResponseEntity.ok(personRepo.findAll());
	}
	
	
}
