package com.inmobiliaria.inmobiliaria.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inmobiliaria.inmobiliaria.models.publicacionEntity;
import com.inmobiliaria.inmobiliaria.models.usuarioEntity;

@Repository
public interface publicacionRepository extends JpaRepository<publicacionEntity, Long> {
	public publicacionEntity findByIdPublicacion(Long idPublicacion);
	
	public List<publicacionEntity> findAllByUsuarioDniUsuario(String dniUsuario);

	@Query("SELECT distinct ciudad FROM publicacionEntity")
	public List<String> getAllCiudad();

	@Query("SELECT distinct distrito FROM publicacionEntity")
	public List<String> getAllDistrito();

	@Query("SELECT p.distrito FROM publicacionEntity p WHERE p.ciudad = :ciudad")
	public  List<String> getAllCiudadDistrito(@Param("ciudad") String ciudad);

}
