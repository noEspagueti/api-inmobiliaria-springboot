/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.inmobiliaria.models;

import jakarta.persistence.*;
import java.sql.Date;


/**
 *
 * @author Miguel
 */
@Entity
@Table(name = "publicacion")
public class publicacionEntity {

    @Id
    @Column(insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPublicacion;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private usuarioEntity usuario;
    
    @OneToOne
    @JoinColumn(name = "idFavorito")
    private favoritosEntity favorito;
    
    private String titulo;
    private String contenido;
    private Double precio;
    private String rutaImg;
    private String tipoPublicacion;
    private String tipoInmueble;
    private Date fecha;

    public publicacionEntity() {
    }

    public publicacionEntity(Long idPublicacion, usuarioEntity usuario, String titulo, String contenido, Double precio, String rutaImg, String tipoPublicacion, String tipoInmueble, Date fecha) {
        this.idPublicacion = idPublicacion;
        this.usuario = usuario;
        this.titulo = titulo;
        this.contenido = contenido;
        this.precio = precio;
        this.rutaImg = rutaImg;
        this.tipoPublicacion = tipoPublicacion;
        this.tipoInmueble = tipoInmueble;
        this.fecha = fecha;
    }

    public Long getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public usuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarioEntity usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg(String rutaImg) {
        this.rutaImg = rutaImg;
    }

    public String getTipoPublicacion() {
        return tipoPublicacion;
    }

    public void setTipoPublicacion(String tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    
    

}
