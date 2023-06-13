package com.inmobiliaria.inmobiliaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inmobiliaria.inmobiliaria.models.contactosEntity;
import com.inmobiliaria.inmobiliaria.services.contactosService;

@RestController
@RequestMapping("/api/contactos")
public class contactosController {

	@Autowired 
	private contactosService servicio;
	
	
	@GetMapping("/all")
	public List<contactosEntity> getAllContactos(){
		return servicio.getAllContactos();
	}
	
	
}
