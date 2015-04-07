package com.andestic.matricula.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "mat_candidatos")
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    long id;
    private String nombre;
    @Column(name = "fecha_nacimiento")
    private
    Date fechaNacimiento;
    @ManyToOne
    private
    EstadoCivil estadoCivil;
    private Boolean genero;
    @Column(name = "ruta_foto")
    private
    String rutaFoto;
    @ManyToOne
    private
    Nacionalidad nacionalidad;
    @ManyToOne
    private
    AscendenciaEtnica ascendenciaEtnica;
    private String contrasena;
    @OneToMany
    private
    List<Direccion> direcciones;
    @OneToMany
    private
    List<Correo> correos;
    @OneToMany
    private
    List<Matricula> matriculas;
    @OneToMany
    private
    List<Beca> becas;

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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Boolean isGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public AscendenciaEtnica getAscendenciaEtnica() {
        return ascendenciaEtnica;
    }

    public void setAscendenciaEtnica(AscendenciaEtnica ascendenciaEtnica) {
        this.ascendenciaEtnica = ascendenciaEtnica;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Correo> getCorreos() {
        return correos;
    }

    public void setCorreos(List<Correo> correos) {
        this.correos = correos;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<Beca> getBecas() {
        return becas;
    }

    public void setBecas(List<Beca> becas) {
        this.becas = becas;
    }
}
