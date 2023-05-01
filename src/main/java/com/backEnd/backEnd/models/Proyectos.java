package com.backEnd.backEnd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProy;
    private String tituloProy;
    private String descripcionProy;
    private String fechaProy;
    private String verMasProyURL;

    private String imagenProy;

    public Proyectos() {
    }

    public Proyectos(Long idProy, String tituloProy, String descripcionProy, String fechaProy, String verMasProyURL, String imagenProy) {
        this.idProy = idProy;
        this.tituloProy = tituloProy;
        this.descripcionProy = descripcionProy;
        this.fechaProy = fechaProy;
        this.verMasProyURL = verMasProyURL;
        this.imagenProy = imagenProy;
    }

    public Long getIdProy() {
        return idProy;
    }

    public void setIdProy(Long idProy) {
        this.idProy = idProy;
    }

    public String getTituloProy() {
        return tituloProy;
    }

    public void setTituloProy(String tituloProy) {
        this.tituloProy = tituloProy;
    }

    public String getDescripcionProy() {
        return descripcionProy;
    }

    public void setDescripcionProy(String descripcionProy) {
        this.descripcionProy = descripcionProy;
    }

    public String getFechaProy() {
        return fechaProy;
    }

    public void setFechaProy(String fechaProy) {
        this.fechaProy = fechaProy;
    }

    public String getVerMasProyURL() {
        return verMasProyURL;
    }

    public void setVerMasProyURL(String verMasProyURL) {
        this.verMasProyURL = verMasProyURL;
    }

    public String getImagenProy() {
        return imagenProy;
    }

    public void setImagenProy(String imagenProy) {
        this.imagenProy = imagenProy;
    }
}
