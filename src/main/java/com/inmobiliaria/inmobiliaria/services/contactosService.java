package com.inmobiliaria.inmobiliaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.models.contactosEntity;
import com.inmobiliaria.inmobiliaria.repository.contactosRepository;

@Service
public class contactosService {

	@Autowired
	private contactosRepository repositorio;

	public List<contactosEntity> getAllContactos() {
		return repositorio.findAll();
	}

	public List<contactosEntity> getAllByDniContacto(String dniContacto) {
		return repositorio.findAllByDniContacto(dniContacto);
	}

	public contactosEntity save(contactosEntity contacto) {
		return repositorio.save(contacto);
	}

}
