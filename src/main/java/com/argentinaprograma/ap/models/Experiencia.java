package com.argentinaprograma.ap.models;

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
    private String tipoExp;
    private String descripcionExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, String tipoExp, String descripcionExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.tipoExp = tipoExp;
        this.descripcionExp = descripcionExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public String getTipoExp() {
        return tipoExp;
    }


    public String getDescripcionExp() { return descripcionExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public void setTipoExp(String tipoExp) {
        this.tipoExp = tipoExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }
}
