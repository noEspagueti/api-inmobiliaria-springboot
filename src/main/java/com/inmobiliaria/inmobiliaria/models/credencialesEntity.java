package com.inmobiliaria.inmobiliaria.models;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

	@OneToOne(mappedBy = "credenciales", cascade = CascadeType.ALL)
	@JsonBackReference
	private usuarioEntity usuario;

	@Column(unique = true,length = 80)
	private String correo;
	private String clave;

	public credencialesEntity() {
	}

	public credencialesEntity(String correo, String clave) {
		this.correo = correo;
		this.clave = clave;
	}

	public credencialesEntity(usuarioEntity usuario, String correo, String clave) {
		this.usuario = usuario;
		this.correo = correo;
		this.clave = clave;
	}

	public credencialesEntity(Long idCredenciales, usuarioEntity usuario, String correo, String clave) {
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

	public usuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(usuarioEntity usuario) {
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
