package com.gestionHospital.demo.entity;

import jakarta.persistence.*;


@Entity

@Table(name="gerente")
public class Gerente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_gerente")
    private Integer id_gerente;
    @Column(name="nom_gerente")
    private String nom_gerente;


    public Integer getId_gerente() {
        return id_gerente;
    }

    public void setId_gerente(Integer id_gerente) {
        this.id_gerente = id_gerente;
    }

    public String getNom_gerente() {
        return nom_gerente;
    }

    public void setNom_gerente(String nom_gerente) {
        this.nom_gerente = nom_gerente;
    }
}
