package com.example.adresseexoback.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
	
	@Id
	@GeneratedValue
	UUID id;
	
	String country;
	
	String city;
	
	String street;
	
	String zipcode;
	

}
