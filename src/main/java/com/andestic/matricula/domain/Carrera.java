package com.andestic.matricula.domain;

import javax.persistence.*;

@Entity
@Table(name = "mat_carreras")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    long id;
    @ManyToOne
    private
    Facultad facultad;
    private long arancel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public long getArancel() {
        return arancel;
    }

    public void setArancel(long arancel) {
        this.arancel = arancel;
    }
}
