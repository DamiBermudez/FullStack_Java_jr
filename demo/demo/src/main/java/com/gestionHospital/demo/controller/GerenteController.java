package com.gestionHospital.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gestionHospital.demo.entity.Gerente;
import com.gestionHospital.demo.repository.GerenteRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gerentes")
@CrossOrigin(origins = "*")
public class GerenteController {

    @Autowired
    private GerenteRepository repository;

    @GetMapping
    public List<Gerente> listarGerentes() {
        return repository.findAll();
    }
}


