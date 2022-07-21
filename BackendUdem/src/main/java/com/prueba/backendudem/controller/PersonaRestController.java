package com.prueba.backendudem.controller;

import com.prueba.backendudem.repository.entity.Persona;
import com.prueba.backendudem.service.InPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaRestController {

    @Autowired
    private InPersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> index(){
        return personaService.findAll();
    };

    @GetMapping("/personas/{id}")
    public Persona show (@PathVariable Long id){
        return personaService.findById(id);
    };

    @PostMapping("/personas")
    public Persona create(@RequestBody Persona persona){
        return personaService.save(persona);
    };

    @PutMapping("/personas/{id}")
    public Persona update(@RequestBody Persona persona, @PathVariable Long id){
        Persona personaActualService = personaService.findById(id);

        personaActualService.setNombre(persona.getNombre());
        personaActualService.setApellido(persona.getApellido());
        personaActualService.setDocumento(persona.getDocumento());
        personaActualService.setTelefono(persona.getTelefono());

        return personaService.save(personaActualService);
    };

    @DeleteMapping("/personas/{id}")
    public void delete(@PathVariable Long id){
        personaService.delete(id);
    };
}
