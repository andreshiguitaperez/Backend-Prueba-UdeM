package com.prueba.backendudem.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "personas")
@Getter
@Setter
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name="apelldio", length = 50, nullable = false)
    private String apellido;

    @Column(name="documento", length = 12, nullable = false)
    private Integer documento;

    @Column(name="telefono", length = 12)
    private Integer telefono;


}
