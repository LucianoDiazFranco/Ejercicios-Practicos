package com.coderhouse.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coderhouse.modelos.Curso;
import com.coderhouse.repositorios.CursoRepository;



@RestController // Indicamos que es un controlador
@RequestMapping("/cursos")//indicamos que cuando llamemos a cursos nos dirigimos a ese apartado
public class CursoController {

	@Autowired // asi podemos usar todos los metodos del repositorio 
	private CursoRepository cursoRepository;
	
	@GetMapping(value="/", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Curso>> listarAlumnos(){
		try {
			List<Curso> cursos = cursoRepository.findAll();
			return new ResponseEntity<>(cursos, HttpStatus.OK);// codigo 200
			
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);//error 500
		}
		
	}





}
