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

    @Embedded
    List<publicacionEntity> publicacion;

    public favoritosEntity() {
    }

    public favoritosEntity(Long idfavoritos, List<publicacionEntity> publicacion) {
        this.idfavoritos = idfavoritos;
        this.publicacion = publicacion;
    }

    public Long getIdfavoritos() {
        return idfavoritos;
    }

    public void setIdfavoritos(Long idfavoritos) {
        this.idfavoritos = idfavoritos;
    }

    public List<publicacionEntity> getPublicacion() {
        return publicacion;
    }

    public void setPublicaion(List<publicacionEntity> publicacion) {
        this.publicacion = publicacion;
    }

}
