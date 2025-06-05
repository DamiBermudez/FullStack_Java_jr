package com.gestionHospital.demo.controller;

import com.gestionHospital.demo.entity.Distrito;
import com.gestionHospital.demo.repository.DistritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/distritos")
@CrossOrigin(origins = "*")

public class DistritoController {
    @Autowired
    private DistritoRepository repository;

    @GetMapping
    public List<Distrito> listarDistrito() {
        return repository.findAll();
    }
}

