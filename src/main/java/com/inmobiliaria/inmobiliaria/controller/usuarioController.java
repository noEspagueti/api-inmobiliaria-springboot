
package com.inmobiliaria.inmobiliaria.controller;

import com.inmobiliaria.inmobiliaria.models.credencialesEntity;
import com.inmobiliaria.inmobiliaria.models.usuarioEntity;
import com.inmobiliaria.inmobiliaria.services.credencialesServices;
import com.inmobiliaria.inmobiliaria.services.usuarioServices;
import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	public usuarioEntity saveUsuario(@RequestBody usuarioEntity usuarioRequest) {
		credencialesEntity credencial = new credencialesEntity(usuarioRequest.getCredenciales().getCorreo(),
				usuarioRequest.getCredenciales().getClave());
		credencial = credencialesService.saveCredenciales(credencial);
		usuarioEntity newUser = new usuarioEntity(usuarioRequest.getDniUsuario(),credencial,usuarioRequest.getNombre(),usuarioRequest.getApellido(),usuarioRequest.getDireccion(),usuarioRequest.getDistrito(),usuarioRequest.getCelular(),usuarioRequest.getTipoUsuario());
		return usuarioService.saveUsuario(newUser);
	}

	// METHOD PARA BUSCAR POR CREDENCIALES
	@GetMapping("/{correo}")
	public ResponseEntity<usuarioEntity> findByCorreoUsuario(@PathVariable String correo) {
		usuarioEntity usuario = usuarioService.findByCredencialesCorreo(correo);
		return ResponseEntity.ok(usuario);
	}
}
