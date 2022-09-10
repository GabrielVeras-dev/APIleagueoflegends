package com.apilol.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Champions {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name; // name é o Id, visto que o Id é igual ao nome.
	private String title, description, image, tags; // description = blurb
	
}
