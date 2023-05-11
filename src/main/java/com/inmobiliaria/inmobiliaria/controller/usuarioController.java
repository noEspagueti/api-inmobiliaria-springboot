/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.inmobiliaria.controller;

import com.inmobiliaria.inmobiliaria.models.usuarioEntity;
import com.inmobiliaria.inmobiliaria.services.usuarioServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miguel
 */

@RestController
@RequestMapping("/api/usuarios")
public class usuarioController {
    @Autowired
    usuarioServices usuarioService;
    
    @GetMapping("/all")
        public List<usuarioEntity> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    } 
    
}
