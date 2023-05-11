/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.inmobiliaria.services;

import com.inmobiliaria.inmobiliaria.models.credencialesEntity;
import com.inmobiliaria.inmobiliaria.repository.credencialesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel
 */
@Service
public class credencialesServices {

    @Autowired
    private credencialesRepository credencialesRepository;

    public List<credencialesEntity> getAllCredenciales(){
        return credencialesRepository.findAll();
    }
    
    public credencialesEntity saveCredenciales(credencialesEntity credencial) {
        return credencialesRepository.save(credencial);
    }
}
