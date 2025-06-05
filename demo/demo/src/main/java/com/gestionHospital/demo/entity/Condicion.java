package com.gestionHospital.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "condicion")
public class Condicion {
    @Id
    private int id_condicion;
    @Column
    private String nom_condicion;

    public int getId_condicion() {
        return id_condicion;
    }

    public void setId_condicion(int id_condicion) {
        this.id_condicion = id_condicion;
    }

    public String getNom_condicion() {
        return nom_condicion;
    }

    public void setNom_condicion(String nom_condicion) {
        this.nom_condicion = nom_condicion;
    }
}
