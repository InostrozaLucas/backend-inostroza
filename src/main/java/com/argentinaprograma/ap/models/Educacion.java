package com.argentinaprograma.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private String tipoEdu;
    private String imagenEdu;
    private String descripcionEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, String tipoEdu, String imagenEdu, String descripcionEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.tipoEdu = tipoEdu;
        this.imagenEdu = imagenEdu;
        this.descripcionEdu = descripcionEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public String getTipoEdu() {
        return tipoEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public void setTipoEdu(String tipoEdu) {
        this.tipoEdu = tipoEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }
}
