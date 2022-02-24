package com.dwes.manana.springboot.tarea.jesus.daza.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Deportista {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private String apellidos;
	
	@Column(nullable=false)
	private int edad;
	
	@Column(nullable=false)
	private double ganancias;
	
	@Column(nullable=false)
	private String deporte;
	
	@Column(nullable=false)
	private boolean activo;
	
	public Deportista() {
	}
	
	public Deportista(long id, String nombre, String apellidos, int edad, double ganancias, String deporte, boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.ganancias = ganancias;
		this.deporte = deporte;
		this.activo = activo;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getGanancias() {
		return this.ganancias;
	}
	
	public boolean getActivo() {
		return this.activo;
	}
	
	public String getDeporte() {
		return this.deporte;
	}
	
	public void setId(Long id) {
		this.id= id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}
	
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
}
