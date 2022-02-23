package com.dwes.manana.springboot.tarea.jesus.daza.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public String edit(Deportista d) {
		Long num = d.getId();

		if (repositorio.findById(num).isPresent()) {
			Deportista deportistaToUpdate = new Deportista();
			deportistaToUpdate.setId(d.getId());
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
	
}
