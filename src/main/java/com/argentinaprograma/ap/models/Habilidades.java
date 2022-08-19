package com.argentinaprograma.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHab;
    private String tipoHab;
    private String fotoHab;
    private int porcentaje;

    public Habilidades() {
    }

    public Habilidades(Long idHab, String tipoHab, String fotoHab, int porcentaje) {
        this.idHab = idHab;
        this.tipoHab = tipoHab;
        this.fotoHab = fotoHab;
        this.porcentaje = porcentaje;
    }

    public Long getIdHab() {
        return idHab;
    }

    public String getTipoHab() {
        return tipoHab;
    }

    public String getFotoHab() {
        return fotoHab;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setIdHab(Long idHab) {
        this.idHab = idHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    public void setFotoHab(String fotoHab) {
        this.fotoHab = fotoHab;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
}
