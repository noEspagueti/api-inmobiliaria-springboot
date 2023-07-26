package com.inmobiliaria.inmobiliaria.services.inmuebles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.models.inmuebles.departamentoEntity;
import com.inmobiliaria.inmobiliaria.repository.inmuebles.departamentoRepository;

@Service
public class departamentoService {

    @Autowired
    private departamentoRepository repository;

    public departamentoEntity saveEntity(departamentoEntity departamento) {
        return repository.save(departamento);
    }

}
