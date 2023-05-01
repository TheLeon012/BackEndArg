package com.backEnd.backEnd.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContac;
    private String linkRedSocial;
    private String imagenUrlContacto;

    private String descripcionContacto;

    public Contacto() {
    }

    public Contacto(Long idContac, String linkRedSocial, String imagenUrlContacto, String descripcionContacto) {
        this.idContac = idContac;
        this.linkRedSocial = linkRedSocial;
        this.imagenUrlContacto = imagenUrlContacto;
        this.descripcionContacto = descripcionContacto;
    }

    public Long getIdContac() {
        return idContac;
    }

    public void setIdContac(Long idContac) {
        this.idContac = idContac;
    }

    public String getLinkRedSocial() {
        return linkRedSocial;
    }

    public void setLinkRedSocial(String linkRedSocial) {
        this.linkRedSocial = linkRedSocial;
    }

    public String getImagenUrlContacto() {
        return imagenUrlContacto;
    }

    public void setImagenUrlContacto(String imagenUrlContacto) {
        this.imagenUrlContacto = imagenUrlContacto;
    }

    public String getDescripcionContacto() {
        return descripcionContacto;
    }

    public void setDescripcionContacto(String descripcionContacto) {
        this.descripcionContacto = descripcionContacto;
    }
}

