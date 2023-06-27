package com.inmobiliaria.inmobiliaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmobiliaria.inmobiliaria.models.contactosEntity;

@Repository
public interface contactosRepository extends JpaRepository<contactosEntity, String> {

	public List<contactosEntity> findAllByDniContacto(String dniContacto);

}
