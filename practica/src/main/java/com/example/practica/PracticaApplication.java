package com.example.practica;

import com.example.practica.services.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaApplication {
    
        @Autowired
        private PersonaServicio personaServicio;
        
	public static void main(String[] args) {
		SpringApplication.run(PracticaApplication.class, args);
                
	}

}
