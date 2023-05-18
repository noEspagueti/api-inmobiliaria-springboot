package com.inmobiliaria.inmobiliaria.controller;

import com.inmobiliaria.inmobiliaria.models.credencialesEntity;
import com.inmobiliaria.inmobiliaria.models.usuarioEntity;
import com.inmobiliaria.inmobiliaria.services.credencialesServices;
import com.inmobiliaria.inmobiliaria.services.usuarioServices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Miguel
 */

@RestController
@RequestMapping("/api/credenciales")
public class credencialesController {

	@Autowired
	private credencialesServices credencialesService;

	@Autowired
	private usuarioServices usuariosServices;

	@GetMapping("/all")

	public List<credencialesEntity> getAllUsuarios() {
		return credencialesService.getAllCredenciales();
	}

	@GetMapping("/{correo}")
	public ResponseEntity<?> getUsuarioByCorreo(@PathVariable String correo) {
		credencialesEntity credencialUsuario = credencialesService.findByCorreo(correo);
		if (credencialUsuario == null) {
			Map<String, String> errorNotFound = new HashMap<String, String>();
			errorNotFound.put("error", "Usuario no existe");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorNotFound);
		}
		return ResponseEntity.ok(credencialUsuario);
	}

}
