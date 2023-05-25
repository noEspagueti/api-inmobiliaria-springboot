/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.inmobiliaria.services;

import com.inmobiliaria.inmobiliaria.models.credencialesEntity;
import com.inmobiliaria.inmobiliaria.models.usuarioEntity;
import com.inmobiliaria.inmobiliaria.repository.usuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel
 */
@Service
public class usuarioServices {

	@Autowired
	private usuarioRepository usuarioRepo;

	public List<usuarioEntity> getAllUsuarios() {
		return usuarioRepo.findAll();
	}

	public usuarioEntity saveUsuario(usuarioEntity usuario) {
		return usuarioRepo.save(usuario);
	}
	
	public usuarioEntity findByCredencialesCorreo(String correo) {
		return usuarioRepo.findByCredencialesCorreo(correo);
	}
}
