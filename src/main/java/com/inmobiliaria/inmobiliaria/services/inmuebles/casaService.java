package com.inmobiliaria.inmobiliaria.services.inmuebles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.models.inmuebles.casaEntity;
import com.inmobiliaria.inmobiliaria.repository.inmuebles.casaRepository;

@Service
public class casaService {
    @Autowired
    private casaRepository repository;

    public casaEntity saveEntityCasa(casaEntity casa) {
        return repository.save(casa);

    }
}
