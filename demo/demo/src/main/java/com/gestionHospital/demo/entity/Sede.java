package com.gestionHospital.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sede")
public class Sede {
    @Id
    @Column
    private int id_sede;

    @Column
    private String nom_sede;

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getNom_sede() {
        return nom_sede;
    }

    public void setNom_sede(String nom_sede) {
        this.nom_sede = nom_sede;
    }
}
