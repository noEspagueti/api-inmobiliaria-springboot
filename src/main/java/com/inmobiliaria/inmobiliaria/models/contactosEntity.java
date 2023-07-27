package com.inmobiliaria.inmobiliaria.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "contactos")
public class contactosEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 8, unique = false)
	private Long idContacto;

	@Column(length = 100)
	private String nombres;
	@Column(length = 100)
	private String apellidos;
	@Column(length = 100, unique = true)
	private String correo;
	@Column(length = 9)
	private String celular;

	private String dniContacto;

	private String mensaje;

	private Date fecha;

	// @JoinTable(name = "rel_contacto_usuario", joinColumns = @JoinColumn(name =
	// "FK_contacto"), inverseJoinColumns = @JoinColumn(name = "FK_usuario"))
	// @ManyToMany
	// private List<usuarioEntity> usuario;

	@ManyToOne
	@JoinColumn(name = "dniUsuario")
	private usuarioEntity usuario;

	public contactosEntity() {
		super();
	}

	public contactosEntity(Long idContacto, String nombres, String apellidos, String correo, String celular,
			String dniContacto, String mensaje, Date fecha, usuarioEntity usuario) {
		this.idContacto = idContacto;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.celular = celular;
		this.dniContacto = dniContacto;
		this.mensaje = mensaje;
		this.fecha = fecha;
		this.usuario = usuario;
	}

	public Long getIdContacto() {
		return this.idContacto;
	}

	public void setIdContacto(Long idContacto) {
		this.idContacto = idContacto;
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

	public String getDniContacto() {
		return this.dniContacto;
	}

	public void setDniContacto(String dniContacto) {
		this.dniContacto = dniContacto;
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
