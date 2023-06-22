package com.inmobiliaria.inmobiliaria.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "contactos")
public class contactosEntity {

	@Id
	@Column(length = 8)
	private String dniContacto;
	@Column(length = 100)
	private String nombres;
	@Column(length = 100)
	private String apellidos;
	@Column(length = 100, unique = true)
	private String correo;
	@Column(length = 9)
	private String celular;

	private String mensaje;

	private Date fecha;

	@ManyToOne
	@JoinColumn(name = "dniUsuario")
	private usuarioEntity usuario;

	public contactosEntity() {
		super();
	}

	public contactosEntity(String dniContacto, String nombres, String apellidos, String correo, String celular,
			String mensaje, Date fecha, usuarioEntity usuario) {
		super();
		this.dniContacto = dniContacto;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.celular = celular;
		this.usuario = usuario;
		this.mensaje = mensaje;
		this.fecha = fecha;
	}

	public contactosEntity(String dniContacto, String nombres, String apellidos, String correo, String celular) {
		super();
		this.dniContacto = dniContacto;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.celular = celular;
	}

	public String getDniContacto() {
		return this.dniContacto;
	}

	public void setDniContacto(String dniContacto) {
		this.dniContacto = dniContacto;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public usuarioEntity getUsuario() {
		return this.usuario;
	}

	public void setUsuario(usuarioEntity usuario) {
		this.usuario = usuario;
	}

}
