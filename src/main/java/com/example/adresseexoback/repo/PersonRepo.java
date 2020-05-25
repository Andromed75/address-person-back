package com.example.adresseexoback.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adresseexoback.domain.Person;

public interface PersonRepo extends JpaRepository<Person, UUID>{

}
