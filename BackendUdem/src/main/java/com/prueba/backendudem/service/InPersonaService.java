package com.prueba.backendudem.service;

import com.prueba.backendudem.repository.entity.Persona;

import java.util.List;


public interface InPersonaService {

    public List<Persona> findAll();
    public Persona findById(Long id);
    public Persona save(Persona persona);
    public void delete(Long id);
}
