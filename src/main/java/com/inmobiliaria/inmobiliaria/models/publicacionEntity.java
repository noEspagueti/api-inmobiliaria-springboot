/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.inmobiliaria.models;

import jakarta.persistence.*;
import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;

/**
 *
 * @author Miguel
 */
@Entity
@Table(name = "publicacion")
public class publicacionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPublicacion;

	@ManyToOne
	@JoinColumn(name = "dniUsuario")
	private usuarioEntity usuario;
	
	@Column(length = 50)
	private String titulo;
	
	@Column(length = 50)
	private String distrito;
	
	@Column(length = 50)
	private String ciudad;
	
	private String contenido;
	
	private Double precio;
	
	@Column(length = 50)
	private String rutaImg;
	
	@Column(length = 50)
	private String tipoPublicacion;
	
	@Column(length = 50)
	private String tipoInmueble;
	
	
	private Date fecha;

	public publicacionEntity() {

	}

	public publicacionEntity(usuarioEntity usuario, String titulo, String distrito, String ciudad, String contenido,
			Double precio, String rutaImg, String tipoPublicacion, String tipoInmueble, Date fecha) {
		this.usuario = usuario;
		this.titulo = titulo;
		this.distrito = distrito;
		this.ciudad = ciudad;
		this.contenido = contenido;
		this.precio = precio;
		this.rutaImg = rutaImg;
		this.tipoPublicacion = tipoPublicacion;
		this.tipoInmueble = tipoInmueble;
		this.fecha = fecha;
	}

	public publicacionEntity(Long idPublicacion, usuarioEntity usuario, String titulo, String distrito, String ciudad,
			String contenido, Double precio, String rutaImg, String tipoPublicacion, String tipoInmueble, Date fecha) {
		super();
		this.idPublicacion = idPublicacion;
		this.usuario = usuario;
		this.titulo = titulo;
		this.distrito = distrito;
		this.ciudad = ciudad;
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

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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
