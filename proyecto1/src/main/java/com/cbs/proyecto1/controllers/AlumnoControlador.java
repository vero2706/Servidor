package com.cbs.proyecto1.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.proyecto1.models.AlumnoDto;

@RestController
public class AlumnoControlador {

	private List<AlumnoDto> listaAlumnos;

	public AlumnoControlador() {

		listaAlumnos = new ArrayList<AlumnoDto>();
		listaAlumnos.add(new AlumnoDto("Pepe", "Roca"));

	}

	@GetMapping("/AlumnoDto/List")
	public List<AlumnoDto> List() {
		return listaAlumnos;
	}

	@GetMapping("/AlumnoDto/add")
	public List<AlumnoDto> ListaAlumnos() {

		listaAlumnos.add(new AlumnoDto("Pepe", "Roca"));
		return listaAlumnos;

	}
}
