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
@Table(name = "contactos")
public class contactosEntity {

    @Id
    @Column(insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContacto;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private usuarioEntity usuario;
    @Column(length = 50)
    private String nombres;
    @Column(length = 50)
    private String apellidos;
    @Column(length = 100)
    private String direccion;
    @Column(length = 50)
    private String distrito;
    @Column(length = 9)
    private String celular;

    public contactosEntity() {
    }

    public contactosEntity(Long idContacto, usuarioEntity usuario, String nombres, String apellidos, String direccion, String distrito, String celular) {
        this.idContacto = idContacto;
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.distrito = distrito;
        this.celular = celular;
    }

   

    public Long getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Long idContacto) {
        this.idContacto = idContacto;
    }

    public usuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarioEntity usuario) {
        this.usuario = usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
