package com.backEnd.backEnd.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCurso;
    private String certificadoUrlCurso;

    public Cursos() {
    }

    public Cursos(Long idCurso, String certificadoUrlCurso) {
        this.idCurso = idCurso;
        this.certificadoUrlCurso = certificadoUrlCurso;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getCertificadoUrlCurso() {
        return certificadoUrlCurso;
    }

    public void setCertificadoUrlCurso(String certificadoUrlCurso) {
        this.certificadoUrlCurso = certificadoUrlCurso;
    }
}
