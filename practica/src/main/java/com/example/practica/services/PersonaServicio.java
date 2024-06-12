/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.practica.services;

import com.example.practica.entities.Persona;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface PersonaServicio {
    List<Persona> ObtenerTodas();
    
    Persona ObtenerPorId(Long id);
    
    Persona CrearPersona(Persona persona);
    
    Persona ActualizarPersona(Long id,Persona persona);
    
    void EliminarPersona(Long id);
    
    long contarPersonas();
}
