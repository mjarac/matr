package com.andestic.matricula.domain;

import javax.persistence.*;

@Entity
@Table(name = "mat_direcciones")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    long id;
    private String calle;
    private long numero;
    private String departamento;
    private String block;
    @Column(name = "poblacion_villa")
    private
    String poblacionVilla;
    @ManyToOne
    private
    Comuna comuna;
    @ManyToOne
    private
    TipoDireccion tipoDireccion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getPoblacionVilla() {
        return poblacionVilla;
    }

    public void setPoblacionVilla(String poblacionVilla) {
        this.poblacionVilla = poblacionVilla;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }
}
