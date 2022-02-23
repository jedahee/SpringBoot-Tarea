package com.dwes.manana.springboot.tarea.jesus.daza.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwes.manana.springboot.tarea.jesus.daza.models.Deportista;

public interface DeportistaRepository extends JpaRepository<Deportista, Long> {
	//public List<Student> findByNameOrLastName (String name, String lastName);
	public List<Deportista> findByActivoTrue();
}
