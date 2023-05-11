/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.inmobiliaria.models;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Miguel
 */
@Entity
@Table(name = "usuario")

public class usuarioEntity {

    @Id
    @Column(insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @ManyToOne
    @JoinColumn(name = "idCredenciales")
    private credencialesEntity credenciales;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<publicacionEntity> publicacion;

    @Embedded
    private Set<favoritosEntity> favoritos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<contactosEntity> contactos;

    @Column(length = 60)
    private String nombre;
    @Column(length = 60)
    private String apellido;
    @Column(length = 60)
    private String direccion;
    private String distrito;
    private String celular;

    public usuarioEntity() {
    }

    public usuarioEntity(Long idUsuario, credencialesEntity credenciales, List<publicacionEntity> publicacion, Set<favoritosEntity> favoritos, List<contactosEntity> contactos, String nombre, String apellido, String direccion, String distrito, String celular) {
        this.idUsuario = idUsuario;
        this.credenciales = credenciales;
        this.publicacion = publicacion;
        this.favoritos = favoritos;
        this.contactos = contactos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.distrito = distrito;
        this.celular = celular;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getCredenciales() {
        return credenciales.getIdCredenciales();
    }

    public void setCredenciales(credencialesEntity credenciales) {
        this.credenciales = credenciales;
    }

    public List<publicacionEntity> getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(List<publicacionEntity> publicacion) {
        this.publicacion = publicacion;
    }

    public Set<favoritosEntity> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Set<favoritosEntity> favoritos) {
        this.favoritos = favoritos;
    }

    public List<contactosEntity> getContactos() {
        return contactos;
    }

    public void setContactos(List<contactosEntity> contactos) {
        this.contactos = contactos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
