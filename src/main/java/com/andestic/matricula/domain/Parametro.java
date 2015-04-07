package com.andestic.matricula.domain;

import javax.persistence.*;

@Entity
@Table(name = "mat_parametros")
public class Parametro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    long id;
    @ManyToOne
    private
    Proceso proceso;
    @ManyToOne
    private
    Facultad facultad;
    @ManyToOne
    private
    Carrera carrera;
    private String llave;
    private String valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
