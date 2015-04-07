package com.andestic.matricula.domain;

import javax.persistence.*;

@Entity
@Table(name = "mat_correos")
public class Correo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    long id;
    private String correo;
    @ManyToOne
    private
    TipoCorreo tipoCorreo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public TipoCorreo getTipoCorreo() {
        return tipoCorreo;
    }

    public void setTipoCorreo(TipoCorreo tipoCorreo) {
        this.tipoCorreo = tipoCorreo;
    }
}
