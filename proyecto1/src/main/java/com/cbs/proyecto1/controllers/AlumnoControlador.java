package com.cbs.proyecto1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.proyecto1.models.AlumnoDto;

@RestController
public class AlumnoControlador {

	private List<AlumnoDto> listaAlumnos;

	public AlumnoControlador() {

		listaAlumnos = new ArrayList<AlumnoDto>();

		listaAlumnos.add(new AlumnoDto(1, "Pepe", "Roca", "77770055l"));

	}

	@GetMapping("/AlumnoDto/List")
	public List<AlumnoDto> List() {
		return listaAlumnos;
	}

	// @PostMapping: Define una ruta para que este método maneje solicitudes HTTP
	// POST en la URL
	@PostMapping("/AlumnoDto/add")
	public List<AlumnoDto> add(@RequestBody AlumnoDto nuevoAlumno) {
		// *@RequestBody: Aquí el nuevo alumno se obtiene del cuerpo de la solicitud.

		listaAlumnos.add(nuevoAlumno);
		return listaAlumnos;

	}

	/*
	 * Identificador nuevo data 
	 * encontrar el objeto a modificar 
	 * que NO exista
	 * Actualizr Objeto data 
	 * guardar sin errores 
	 * 
	 * AVISAR
	 */

	// ACTUALIZAR:
	@PutMapping("/AlumnoDto/update")
	public List<AlumnoDto> update(@RequestBody AlumnoDto AlumnoModificado) {

		return listaAlumnos;

	}
}
