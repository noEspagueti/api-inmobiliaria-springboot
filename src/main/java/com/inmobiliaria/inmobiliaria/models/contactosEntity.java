package com.inmobiliaria.inmobiliaria.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactos")
public class contactosEntity {

	@Id
	@Column(length = 8, unique = true)
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

	public contactosEntity(String dniContacto, String nombres, String apellidos, String correo, String celular) {
		super();
		this.dniContacto = dniContacto;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.celular = celular;
	}

	public String getDniContacto() {
		return dniContacto;
	}

	public void setDniContacto(String dniContacto) {
		this.dniContacto = dniContacto;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
