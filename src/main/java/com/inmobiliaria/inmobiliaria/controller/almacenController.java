package com.inmobiliaria.inmobiliaria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inmobiliaria.inmobiliaria.models.almacenEntity;
import com.inmobiliaria.inmobiliaria.services.AlmacenServicesImpl;

@RestController
@RequestMapping("/api/publicacion/upload")
public class almacenController {

	@Autowired
	private AlmacenServicesImpl almacenService;
	
	//METHOD PARA ALMACENAR ARCHIVOS EN FORMATO JPEG.PNG,JPG	
	@PostMapping("/nuevo")
	public void saveArchivo(@RequestBody almacenEntity archivo) {
		almacenService.almacenarArchivos(archivo.getImagenDecoder(),archivo.getNombreArchivo());
	}

}
