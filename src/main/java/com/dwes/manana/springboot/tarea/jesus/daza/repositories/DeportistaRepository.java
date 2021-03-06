package com.dwes.manana.springboot.tarea.jesus.daza.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwes.manana.springboot.tarea.jesus.daza.models.Deportista;

public interface DeportistaRepository extends JpaRepository<Deportista, Long> {
	//public List<Student> findByNameOrLastName (String name, String lastName);
	public List<Deportista> findByActivoTrue();
	public List<Deportista> findByNombreOrApellidos(String nombre, String apellidos);
	public List<Deportista> findByDeporteLike(String deporte);
	public List<Deportista> findByEdadBetween(int edadMin, int edadMax);
	public List<Deportista> findByGananciasLessThanEqual(double ganancias);
}
