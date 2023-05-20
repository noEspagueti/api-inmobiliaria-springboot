
package com.inmobiliaria.inmobiliaria.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import java.util.List;

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

	@OneToOne(fetch = FetchType.LAZY)
	@JsonManagedReference
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "idCredenciales")
	private credencialesEntity credenciales;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<publicacionEntity> publicacion;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<favoritosEntity> favoritos;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<contactosEntity> contactos;

	@Column(length = 60)
	private String nombre;
	@Column(length = 60)
	private String apellido;
	@Column(length = 60)
	private String direccion;
	@Column(length = 50)
	private String distrito;
	@Column(length = 9)
	private String celular;

	public usuarioEntity() {
	}

	public usuarioEntity(String nombre, String apellido, String direccion, String distrito, String celular) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.distrito = distrito;
		this.celular = celular;
	}

	public usuarioEntity(credencialesEntity credenciales, String nombre, String apellido, String direccion,
			String distrito, String celular) {
		this.credenciales = credenciales;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.distrito = distrito;
		this.celular = celular;
	}

	public usuarioEntity(Long idUsuario, credencialesEntity credenciales, List<publicacionEntity> publicacion,
			List<favoritosEntity> favoritos, List<contactosEntity> contactos, String nombre, String apellido,
			String direccion, String distrito, String celular) {
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

	public credencialesEntity getCredenciales() {
		return credenciales;
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

	public List<favoritosEntity> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<favoritosEntity> favoritos) {
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
