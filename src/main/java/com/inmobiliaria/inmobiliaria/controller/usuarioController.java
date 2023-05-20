
package com.inmobiliaria.inmobiliaria.controller;

import com.inmobiliaria.inmobiliaria.models.credencialesEntity;
import com.inmobiliaria.inmobiliaria.models.usuarioEntity;
import com.inmobiliaria.inmobiliaria.services.credencialesServices;
import com.inmobiliaria.inmobiliaria.services.usuarioServices;
import jakarta.transaction.Transactional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miguel
 */

@RestController
@RequestMapping("/api/usuarios")
public class usuarioController {

	@Autowired
	private usuarioServices usuarioService;
	@Autowired
	private credencialesServices credencialesService;

	@GetMapping("/all")
	public List<usuarioEntity> getAllUsuarios() {
		return usuarioService.getAllUsuarios();
	}

	// METHOD POST PARA CREAR USUARIOS
	@PostMapping
	@Transactional
	public usuarioEntity saveUsuario(@RequestBody usuarioEntity usuarioRequest) {
		credencialesEntity credencial = new credencialesEntity(usuarioRequest.getCredenciales().getCorreo(),
				usuarioRequest.getCredenciales().getClave());
		credencial = credencialesService.saveCredenciales(credencial);
		usuarioEntity newUser = new usuarioEntity(credencial, usuarioRequest.getNombre(), usuarioRequest.getApellido(),
				usuarioRequest.getDireccion(), usuarioRequest.getDistrito(), usuarioRequest.getCelular());
		return usuarioService.saveUsuario(newUser);
	}
	
	
}
