package com.inmobiliaria.inmobiliaria.models;

import org.springframework.web.multipart.MultipartFile;

public class almacenEntity {

	private String imagenDecoder;
	private String nombreArchivo;

	public almacenEntity() {

	}

	public almacenEntity(String imagenDecoder, String nombreArchivo) {
		super();
		this.imagenDecoder = imagenDecoder;
		this.nombreArchivo = nombreArchivo;
	}

	public String getImagenDecoder() {
		return imagenDecoder;
	}

	public void setImagenDecoder(String imagenDecoder) {
		this.imagenDecoder = imagenDecoder;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

}
