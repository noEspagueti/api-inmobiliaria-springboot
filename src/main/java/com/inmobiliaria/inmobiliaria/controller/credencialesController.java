package com.inmobiliaria.inmobiliaria.controller;


import com.inmobiliaria.inmobiliaria.models.credencialesEntity;
import com.inmobiliaria.inmobiliaria.services.credencialesServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Miguel
 */

@RestController
@RequestMapping("/api/credenciales")
public class credencialesController {
    
    @Autowired
    private credencialesServices credencialesService; 
    
    
    @GetMapping("/all")
    
     public List<credencialesEntity> getAllUsuarios() {
        return credencialesService.getAllCredenciales();
    }
     
     
     
    @PostMapping
    public credencialesEntity saveCredencial(@RequestBody credencialesEntity c){
        return credencialesService.saveCredenciales(c);
    }
    
}
