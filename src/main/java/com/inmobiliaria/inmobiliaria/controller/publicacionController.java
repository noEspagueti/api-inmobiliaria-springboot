package com.inmobiliaria.inmobiliaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inmobiliaria.inmobiliaria.models.publicacionEntity;
import com.inmobiliaria.inmobiliaria.services.publicacionServices;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping(value = "/api/publicacion")

public class publicacionController {

	@Autowired
	private publicacionServices publicacionService;

	@GetMapping("/all")
	public List<publicacionEntity> getAllPublicacion() {
		return publicacionService.getFindAll();
	}

	@PostMapping
	@Transactional
	public publicacionEntity savePublicacion(@RequestBody publicacionEntity p) {
		return publicacionService.savePublicacion(p);
	}

}
