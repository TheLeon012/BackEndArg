package com.backEnd.backEnd.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String tituloSkill;

    private int porcentajeSkill;
    private int tipoCircleSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String tituloSkill, int porcentajeSkill, int tipoCircleSkill) {
        this.idSkill = idSkill;
        this.tituloSkill = tituloSkill;
        this.porcentajeSkill = porcentajeSkill;
        this.tipoCircleSkill = tipoCircleSkill;

    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getTituloSkill() {
        return tituloSkill;
    }

    public void setTituloSkill(String tituloSkill) {
        this.tituloSkill = tituloSkill;
    }

    public int getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(int porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }

    public int getTipoCircleSkill() {
        return tipoCircleSkill;
    }

    public void setTipoCircleSkill(int tipoCircleSkill) {
        this.tipoCircleSkill = tipoCircleSkill;
    }


}