/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.inmobiliaria.models;

import jakarta.persistence.*;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.inmobiliaria.inmobiliaria.models.inmuebles.casaEntity;
import com.inmobiliaria.inmobiliaria.models.inmuebles.departamentoEntity;
import com.inmobiliaria.inmobiliaria.models.inmuebles.terrenoEntity;

@Entity
@Table(name = "publicacion")
public class publicacionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPublicacion;

	@ManyToOne
	@JoinColumn(name = "dniUsuario")
	private usuarioEntity usuario;

	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JsonManagedReference
	@JoinColumn(name = "idCasa")
	private casaEntity tipoCasa;

	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JsonManagedReference
	@JoinColumn(name = "idDepartamento")
	private departamentoEntity tipoDepartamento;

	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JsonManagedReference
	@JoinColumn(name = "idTerreno")
	private terrenoEntity terreno;

	@Column(length = 150)
	private String titulo;

	@Column(length = 150)
	private String distrito;

	@Column(length = 200)
	private String direccion;

	@Column(length = 150)
	private String ciudad;

	private String contenido;

	private Double precio;

	@Column(length = 150)
	private String rutaImg;

	@Column(length = 150)
	private String tipoPublicacion;

	@Column(length = 150)
	private String tipoInmueble;

	private Date fecha;

	public publicacionEntity() {

	}

	// CASA
	public publicacionEntity(usuarioEntity usuario, casaEntity tipoCasa, String titulo, String distrito,
			String direccion, String ciudad, String contenido, Double precio, String rutaImg, String tipoPublicacion,
			String tipoInmueble, Date fecha) {
		this.usuario = usuario;
		this.tipoCasa = tipoCasa;
		this.titulo = titulo;
		this.distrito = distrito;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.contenido = contenido;
		this.precio = precio;
		this.rutaImg = rutaImg;
		this.tipoPublicacion = tipoPublicacion;
		this.tipoInmueble = tipoInmueble;
		this.fecha = fecha;
	}

	// DEPARTAMENTO
	public publicacionEntity(usuarioEntity usuario, departamentoEntity tipoDepartamento, String titulo, String distrito,
			String direccion, String ciudad, String contenido, Double precio, String rutaImg, String tipoPublicacion,
			String tipoInmueble, Date fecha) {
		this.usuario = usuario;
		this.tipoDepartamento = tipoDepartamento;
		this.titulo = titulo;
		this.distrito = distrito;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.contenido = contenido;
		this.precio = precio;
		this.rutaImg = rutaImg;
		this.tipoPublicacion = tipoPublicacion;
		this.tipoInmueble = tipoInmueble;
		this.fecha = fecha;
	}

	// TERRENO

	public publicacionEntity(usuarioEntity usuario, terrenoEntity tipoTerreno, String titulo, String distrito,
			String direccion, String ciudad, String contenido, Double precio, String rutaImg, String tipoPublicacion,
			String tipoInmueble, Date fecha) {
		this.usuario = usuario;
		this.terreno = tipoTerreno;
		this.titulo = titulo;
		this.distrito = distrito;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.contenido = contenido;
		this.precio = precio;
		this.rutaImg = rutaImg;
		this.tipoPublicacion = tipoPublicacion;
		this.tipoInmueble = tipoInmueble;
		this.fecha = fecha;
	}

	public publicacionEntity(Long idPublicacion, usuarioEntity usuario, String titulo, String distrito, String ciudad,
			String contenido, Double precio, String rutaImg, String tipoPublicacion, String tipoInmueble, Date fecha,
			String direccion) {
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
		this.direccion = direccion;
	}

	public publicacionEntity(usuarioEntity usuario, casaEntity tipoCasa, departamentoEntity tipoDepartamento,
			terrenoEntity terreno, String titulo, String distrito, String direccion, String ciudad, String contenido,
			Double precio, String rutaImg, String tipoPublicacion, String tipoInmueble, Date fecha) {
		this.usuario = usuario;
		this.tipoCasa = tipoCasa;
		this.tipoDepartamento = tipoDepartamento;
		this.terreno = terreno;
		this.titulo = titulo;
		this.distrito = distrito;
		this.direccion = direccion;
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

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public casaEntity getTipoCasa() {
		return this.tipoCasa;
	}

	public void setTipoCasa(casaEntity tipoCasa) {
		this.tipoCasa = tipoCasa;
	}

	public departamentoEntity getTipoDepartamento() {
		return this.tipoDepartamento;
	}

	public void setTipoDepartamento(departamentoEntity tipoDepartamento) {
		this.tipoDepartamento = tipoDepartamento;
	}

	public terrenoEntity getTerreno() {
		return this.terreno;
	}

	public void setTerreno(terrenoEntity terreno) {
		this.terreno = terreno;
	}

}
