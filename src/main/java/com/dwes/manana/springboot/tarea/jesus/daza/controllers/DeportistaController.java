package com.dwes.manana.springboot.tarea.jesus.daza.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dwes.manana.springboot.tarea.jesus.daza.models.Deportista;
import com.dwes.manana.springboot.tarea.jesus.daza.services.DeportistaService;

@RestController
public class DeportistaController {
	
	@Autowired
	private DeportistaService servicio;
	
	@RequestMapping(value = "/api/deportistas", method = RequestMethod.GET, produces = "application/json")
	public List<Deportista> getDeportistas() {
		return servicio.findDeportistas();
	}
	
	@RequestMapping(value = "/api/deportistas/activos", method = RequestMethod.GET, produces = "application/json")
	public List<Deportista> getDeportistasActivos() {
		return servicio.findActiveDeportista();
	}
	
	@RequestMapping(value = "/api/deportistas/{id}", method = RequestMethod.GET, produces = "application/json")
	public Deportista getDeportista(@PathVariable Long id) {
		return servicio.findDeportista(id);
	}
	
	@PostMapping("/api/deportistas")
	public Deportista addDeportista(@RequestBody Deportista d) {
		return servicio.add(d);
	}
	
	@RequestMapping(value = "/api/deportistas/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteDeportista(@PathVariable Long id) {
		return servicio.del(id);
	}
	
	@RequestMapping(value = "/api/deportistas/{id}", method = RequestMethod.PUT, produces = "application/json")
	public String updateDeportista(@RequestBody Deportista s) {
		return servicio.edit(s);
	}
}
