package com.inmobiliaria.inmobiliaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmobiliaria.inmobiliaria.models.publicacionEntity;

@Repository
public interface publicacionRepository extends JpaRepository<publicacionEntity,Long> {

}
