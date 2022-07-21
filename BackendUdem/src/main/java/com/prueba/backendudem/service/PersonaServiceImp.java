package com.prueba.backendudem.service;

import com.prueba.backendudem.repository.dao.InPersonaDao;
import com.prueba.backendudem.repository.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImp implements InPersonaService {

    @Autowired
    private InPersonaDao personaDao;

    @Override
    public List<Persona> findAll(){return (List<Persona>) personaDao.findAll();}

    @Override
    public Persona findById(Long id){return personaDao.findById(id).orElse(null);}

    @Override
    public Persona save(Persona persona){return personaDao.save(persona);}

    @Override
    public void delete(Long id){ personaDao.deleteById(id);}

}