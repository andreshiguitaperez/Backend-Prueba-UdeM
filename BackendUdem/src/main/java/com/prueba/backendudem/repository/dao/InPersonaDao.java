package com.prueba.backendudem.repository.dao;

import com.prueba.backendudem.repository.entity.Persona;
import org.springframework.data.repository.CrudRepository;
public interface InPersonaDao extends CrudRepository<Persona, Long> {
}
