package com.andestic.matricula.domain;

import javax.persistence.*;

@Entity
@Table(name = "mat_procesos")
public class Proceso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    long id;
    @Column(name = "codigo_proceso")
    private
    String codigo;
    private String descripcion;
    @ManyToOne
    private Universidad universidad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
