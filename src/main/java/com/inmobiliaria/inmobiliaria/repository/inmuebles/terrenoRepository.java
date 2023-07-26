package com.inmobiliaria.inmobiliaria.repository.inmuebles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmobiliaria.inmobiliaria.models.inmuebles.terrenoEntity;

@Repository
public interface terrenoRepository extends JpaRepository<terrenoEntity, Long> {

}
