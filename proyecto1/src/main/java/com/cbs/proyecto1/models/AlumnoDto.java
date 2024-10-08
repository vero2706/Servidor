package com.cbs.proyecto1.models;

import java.util.List;

public class AlumnoDto {

	
	private String nombre;
	private String apellidos;


	public AlumnoDto(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "AlumnoDto [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	

	

	
	
}

	