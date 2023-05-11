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
@Table(name = "credenciales")
public class credencialesEntity {

    @Id
    @Column(insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCredenciales;

    @OneToMany(mappedBy = "credenciales",cascade = CascadeType.ALL)
    private List<usuarioEntity> usuario;

    private String correo;
    private String clave;

    public credencialesEntity() {
    }

    public credencialesEntity(Long idCredenciales, List<usuarioEntity> usuario, String correo, String clave) {
        this.idCredenciales = idCredenciales;
        this.usuario = usuario;
        this.correo = correo;
        this.clave = clave;
    }

    public Long getIdCredenciales() {
        return idCredenciales;
    }

    public void setIdCredenciales(Long idCredenciales) {
        this.idCredenciales = idCredenciales;
    }

    public List<usuarioEntity> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<usuarioEntity> usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
