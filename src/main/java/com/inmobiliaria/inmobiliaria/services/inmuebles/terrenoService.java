package com.inmobiliaria.inmobiliaria.services.inmuebles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.models.inmuebles.terrenoEntity;
import com.inmobiliaria.inmobiliaria.repository.inmuebles.terrenoRepository;

@Service
public class terrenoService {
    @Autowired
    private terrenoRepository repository;

    public terrenoEntity saveEntityTerreno(terrenoEntity terreno) {
        return repository.save(terreno);
    }
}
