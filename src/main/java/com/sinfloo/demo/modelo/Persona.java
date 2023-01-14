package com.sinfloo.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
//El javax.persistencepaquete se movió a una dependencia recién nombrada ( jakarta.persistence.

@Entity
@Table (name = "persona")
	public class Persona {
	//@id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String telefono;
	
	public Persona() {
		// TODO Auto-generated constructor stub
		
	
	}

	public Persona(int id, String name, String telefono) {
		super();
		this.id = id;
		this.name = name;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}	

}
