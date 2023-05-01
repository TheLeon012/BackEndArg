package com.backEnd.backEnd.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private String descripcionExp;
    private String fechaExpInicio;
    private String fechaExpFin;

    private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, String descripcionExp, String fechaExpInicio, String fechaExpFin, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.descripcionExp = descripcionExp;
        this.fechaExpInicio = fechaExpInicio;
        this.fechaExpFin = fechaExpFin;
        this.imagenExp = imagenExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public String getFechaExpInicio() {
        return fechaExpInicio;
    }

    public void setFechaExpInicio(String fechaExpInicio) {
        this.fechaExpInicio = fechaExpInicio;
    }

    public String getFechaExpFin() {
        return fechaExpFin;
    }

    public void setFechaExpFin(String fechaExpFin) {
        this.fechaExpFin = fechaExpFin;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }
}
