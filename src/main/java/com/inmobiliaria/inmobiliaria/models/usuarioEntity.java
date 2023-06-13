
package com.inmobiliaria.inmobiliaria.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	@Column(length = 8, unique = true)
	private String dniUsuario;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JsonManagedReference
	@JoinColumn(name = "idCredenciales")
	private credencialesEntity credenciales;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<publicacionEntity> publicacion;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<contactosEntity> contactos;

	@Column(length = 100)
	private String nombre;
	@Column(length = 100)
	private String apellido;
	@Column(length = 200)
	private String direccion;
	@Column(length = 100)
	private String distrito;
	@Column(length = 9)
	private String celular;

	public usuarioEntity() {
		super();
	}

	// CREAR USUARIO
	public usuarioEntity(String dniUsuario, credencialesEntity credenciales, String nombre, String apellido,
			String direccion, String distrito, String celular) {
		super();
		this.dniUsuario = dniUsuario;
		this.credenciales = credenciales;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.distrito = distrito;
		this.celular = celular;
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
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
