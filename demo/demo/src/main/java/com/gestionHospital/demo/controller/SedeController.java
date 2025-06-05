package com.gestionHospital.demo.controller;


import com.gestionHospital.demo.entity.Sede;
import com.gestionHospital.demo.repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sedes")
@CrossOrigin(origins = "*")

public class SedeController {
    @Autowired
    private SedeRepository repository;

    @GetMapping
    public List<Sede> listarSede() {
        return repository.findAll();
    }
}
