package com.gestionHospital.demo.controller;

import com.gestionHospital.demo.entity.Condicion;
import com.gestionHospital.demo.repository.CondicionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/condiciones")
@CrossOrigin(origins = "*")

public class CondicionController {
    @Autowired
    private CondicionRepository repository;

    @GetMapping
    public List<Condicion> listarCondicion() {
        return repository.findAll();
    }
}
