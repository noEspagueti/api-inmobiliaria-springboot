package com.inmobiliaria.inmobiliaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.models.publicacionEntity;
import com.inmobiliaria.inmobiliaria.repository.publicacionRepository;

@Service
public class publicacionServices {
	
	@Autowired
	private publicacionRepository publicacionRepositorio;

	public List<publicacionEntity> getFindAll() {
		return publicacionRepositorio.findAll();
	}

	public publicacionEntity savePublicacion(publicacionEntity p) {
		return publicacionRepositorio.save(p);
	}

}
