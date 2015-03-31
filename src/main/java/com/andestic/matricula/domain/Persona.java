package com.andestic.matricula.domain;

import javax.persistence.*;

/**
 * Created by jvillane on 31-03-15a.
 */
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String nombre;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
