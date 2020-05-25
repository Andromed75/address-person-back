package com.example.adresseexoback.domain;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

	@Id
	@GeneratedValue
	UUID id;
	
	String firstname;
	
	String lastname;
	
	String birthdate;
	
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	Address address;
	
	
}
