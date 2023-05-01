package com.backEnd.backEnd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEduc;
    private String tituloEdu;
    private String institucionEdu;
    private String fechaInicio;
    private String fechaFin;

    public Educacion() {
    }

    public Educacion(Long idEduc, String tituloEdu, String institucionEdu, String fechaInicio, String fechaFin) {
        this.idEduc = idEduc;
        this.tituloEdu = tituloEdu;
        this.institucionEdu = institucionEdu;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getIdEduc() {
        return idEduc;
    }

    public void setIdEduc(Long idEduc) {
        this.idEduc = idEduc;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getInstitucionEdu() {
        return institucionEdu;
    }

    public void setInstitucionEdu(String institucionEdu) {
        this.institucionEdu = institucionEdu;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
