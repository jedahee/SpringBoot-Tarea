package com.dwes.manana.springboot.tarea.jesus.daza;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dwes.manana.springboot.tarea.jesus.daza.models.Deportista;
import com.dwes.manana.springboot.tarea.jesus.daza.repositories.DeportistaRepository;

@SpringBootApplication
public class DeportistasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeportistasApplication.class, args);
	}
	
	/*@Bean
	CommandLineRunner init (DeportistaRepository repositorio) {
		return (args) -> {
			repositorio.saveAll(
					Arrays.asList(new Deportista (1,"Antonio", "Garía", 20, 500.55f, "futbol", true),
							new Deportista (2,"Jesus", "Daza", 26, 700.0f, "futbol", true),
							new Deportista (3,"Paco", "Barrera", 16, 721.56f, "baloncesto", false),
							new Deportista (4,"Angel", "Heredia", 14, 256.2f, "baloncesto", true),
							new Deportista (5,"Manuel", "Campos", 21, 1000.50f, "futbol", false),
							new Deportista (6,"Tomas", "Naranjo", 19, 958.36f, "voleibol", true)
					)
					
			);
		};
	}*/

}
