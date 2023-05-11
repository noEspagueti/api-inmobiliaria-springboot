/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.inmobiliaria.models;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author Miguel
 */
@Entity
@Table(name = "favoritos")
public class favoritosEntity {

    @Id
    @Column(insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfavoritos;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private usuarioEntity usuario;
    
    
    @OneToOne(mappedBy = "favorito")
    private publicacionEntity publicacion;
    
    public favoritosEntity() {
    }

    public favoritosEntity(Long idfavoritos, usuarioEntity usuario, publicacionEntity publicacion) {
        this.idfavoritos = idfavoritos;
        this.usuario = usuario;
        this.publicacion = publicacion;
    }

    public Long getIdfavoritos() {
        return idfavoritos;
    }

    public void setIdfavoritos(Long idfavoritos) {
        this.idfavoritos = idfavoritos;
    }

    public usuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarioEntity usuario) {
        this.usuario = usuario;
    }

    public publicacionEntity getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(publicacionEntity publicacion) {
        this.publicacion = publicacion;
    }
    
    
    
}
