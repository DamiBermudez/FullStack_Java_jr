package com.gestionHospital.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller


public class CustomerController {
    @GetMapping("/")
    public String loginauth(){
        return "login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/listar")
    public String listar(){
        return "listar";
    }
    @GetMapping("/registrar")
    public String registrar(){
        return "registrar";
    }
    @GetMapping("/actualizar")
    public String actualizar(){
        return "actualizar";
    }
    @GetMapping("/eliminar")
    public String eliminar(){
        return "eliminar";
    }





}
