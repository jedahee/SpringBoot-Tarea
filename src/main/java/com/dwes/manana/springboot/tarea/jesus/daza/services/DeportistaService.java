package com.dwes.manana.springboot.tarea.jesus.daza.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.dwes.manana.springboot.tarea.jesus.daza.models.Deportista;
import com.dwes.manana.springboot.tarea.jesus.daza.repositories.DeportistaRepository;

@Service
public class DeportistaService {
	
	@Autowired
	private DeportistaRepository repositorio;
	
	public List<Deportista> findActiveDeportista() {
		return repositorio.findByActivoTrue();
	}
	
	public List<Deportista> findDeportistas() {
		return repositorio.findAll();
	}
	
	public Deportista findDeportista(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Deportista add(Deportista d) {
		return repositorio.save(d);
	}
	
	public String del(Long id) {
		if (repositorio.findById(id).isPresent()) {
			repositorio.deleteById(id);
			return "Se ha eliminado correctamente";
		}
		return "No se ha podido eliminar";
	}
	
	public String edit(Deportista d, Long id) {
		if (repositorio.findById(id).isPresent()) {
			Deportista deportistaToUpdate = new Deportista();
			deportistaToUpdate.setId(id);
			deportistaToUpdate.setNombre(d.getNombre());
			deportistaToUpdate.setApellidos(d.getApellidos());
			deportistaToUpdate.setDeporte(d.getDeporte());
			deportistaToUpdate.setEdad(d.getEdad());
			deportistaToUpdate.setGanancias(d.getGanancias());
			deportistaToUpdate.setActivo(d.getActivo());
			repositorio.save(deportistaToUpdate);
			return "Deportista modificado";
		}
		return "Error al modificar el deportista";
	}
	
	public List<Deportista> findByNameOrLastName(String nombre, String apellidos) {
		return repositorio.findByNombreOrApellidos(nombre, apellidos);
	}
	
	public List<Deportista> findByFirstnameLike(String deporte) {
		return repositorio.findByDeporteLike(deporte);
	}
	
	public List<Deportista> findByEdadBetween(int edadMin, int edadMax) {
		return repositorio.findByEdadBetween(edadMin, edadMax);
	}
	
	public List<Deportista> findByGananciasLessThanEqual(double ganancias) {
		return repositorio.findByGananciasLessThanEqual(ganancias);
	}
	
	
}
