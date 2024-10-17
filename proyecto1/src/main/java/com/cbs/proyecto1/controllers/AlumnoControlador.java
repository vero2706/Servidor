package com.cbs.proyecto1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
		listaAlumnos.add(new AlumnoDto(2, "00002", "Javier", "Roca"));
		listaAlumnos.add(new AlumnoDto(3, "00003", "María", "Roca"));

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

	// Encontrar el objeto a modificar
	// Error si no existe
	// Actualizar datos del objeto
	// Guardar
	// Sin errores de guardado
	// Avisar

	// ACTUALIZAR:
	@PutMapping("/AlumnoDto/update")
	public String update(@RequestBody AlumnoDto AlumnoModificado) {

		for (AlumnoDto alumno : listaAlumnos) {
			if (alumno.getId() == alumno.getId()) {

				return "Alumno actualizado";
			}
		}
		return "Alumno no encontrado.";
	}

	@DeleteMapping("/AlumnoDto/deleteFull")

	public List<AlumnoDto> deleteFull(@RequestBody AlumnoDto studentDelete) {

		// Opción 1: guardar posición
		// int position = -1;

		// Opción 2: guardar en objeto

		AlumnoDto studentAux = null;
		for (AlumnoDto student : listaAlumnos) {

			if (studentDelete.getDni().equals(student.getDni())) {
				
				// Opción 1: guardar posición
				// position = listaAlumnos.indexOf(student);
				
				// Opción 2: guardar en objeto
				studentAux = student;
			}
		}

		// Opción 1: guardar posición
		// listaAlumnos.remove(position);
		
		// Opción 2: guardar en objeto
		listaAlumnos.remove(studentAux);
		
		// Opción 3: (Intermedia remix de las dos anteriores)
		// int position = listaAlumnos.indexOf(studentAux);
		// listaAlumnos.remove(position);

		return listaAlumnos;
	}

	@DeleteMapping("/student/delete")

	public ResponseEntity<?> delete(@RequestBody AlumnoDto studentDelete) {

		AlumnoDto studentAux = null;

		try {

			for (AlumnoDto student : listaAlumnos) {

				if (studentDelete.getDni().equals(student.getDni())) {

					studentAux = student;
				}
			}

			if (null != studentAux) {
				listaAlumnos.remove(studentAux);

				return ResponseEntity.ok(listaAlumnos);
			} else {
				return ResponseEntity.badRequest().body("Usuario no encontrado");
			}

		} catch (Exception ex) {

			return ResponseEntity.internalServerError().body("error al procesar la eliminación");

		}
		

	}

}
