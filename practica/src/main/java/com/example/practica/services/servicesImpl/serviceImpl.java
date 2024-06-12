/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practica.services.servicesImpl;

import com.example.practica.entities.Persona;
import com.example.practica.repository.PersonaRepository;
import com.example.practica.services.PersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class serviceImpl implements PersonaServicio{
    
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> ObtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona ObtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona CrearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona ActualizarPersona(Long id, Persona persona) {
        Persona personaBBDD = personaRepository.findById(id).orElse(null);
        if (personaBBDD != null) {
            personaBBDD.setNombre(persona.getNombre());
            personaBBDD.setEdad(persona.getEdad());
            return personaRepository.save(personaBBDD);
        }
        return null;
    }

    @Override
    public void EliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public long contarPersonas() {
        return personaRepository.count();
    }

    

}
