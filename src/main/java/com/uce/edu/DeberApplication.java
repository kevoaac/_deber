package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeberApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola mundo");
		System.out.println("Código para el commit de inicialización del proyecto");
		System.out.println("Cambio para la misma rama -> 'main'");
		System.out.println("Cambio para nueva rama -> 'nuevaRama'");
		
	}

}
