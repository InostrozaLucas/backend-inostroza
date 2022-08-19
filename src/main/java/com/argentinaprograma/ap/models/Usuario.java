package com.argentinaprograma.ap.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String nombreApell;
    private String titulo;
    private String descripcion;
    private String fotoPerfil;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experieciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idHab")
    private List<Habilidades> habilidadesList;

    public Usuario() {
    }

    public Usuario(Long id, String nombreApell, String titulo, String descripcion, String fotoPerfil) {
        this.id = id;
        this.nombreApell = nombreApell;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
    }

    public Long getId() {
        return id;
    }

    public String getNombreApell() {
        return nombreApell;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombreApell(String nombreApell) {
        this.nombreApell = nombreApell;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}
