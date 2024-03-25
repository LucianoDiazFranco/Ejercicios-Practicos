package com.coderhouse.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coderhouse.entidades.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
