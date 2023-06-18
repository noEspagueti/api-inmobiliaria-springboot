package com.inmobiliaria.inmobiliaria.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.models.publicacionEntity;
import com.inmobiliaria.inmobiliaria.models.usuarioEntity;
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
	
	
	public List<publicacionEntity> getPublicacionesByUsuario(String dniusuario) {
		return publicacionRepositorio.findAllByUsuarioDniUsuario(dniusuario);
	}
	
	public List<String> getPublicacionesByCiudad(){
		return publicacionRepositorio.getAllCiudad();
	}

	
	public List<String> getPublicacionesByDistrito(){
		return publicacionRepositorio.getAllDistrito();
	}
	
	public  List<String> getListDistritoByCiudad(String ciudad){
		return publicacionRepositorio.getAllCiudadDistrito(ciudad);
	}
	
	public publicacionEntity getByIdPublicacion(Long idPublicacion) {
		return publicacionRepositorio.findByIdPublicacion(idPublicacion);
	}
	
	
	public List<publicacionEntity> findAllByCiudad(String ciudad){
		return publicacionRepositorio.getAllByCiudad(ciudad);
	}
	
	public List<publicacionEntity> findAllByCiudadAndDistrito(String ciudad, String distrito){
		return publicacionRepositorio.getAllByCiudadAndDistrito(ciudad, distrito);
	}
	
}
