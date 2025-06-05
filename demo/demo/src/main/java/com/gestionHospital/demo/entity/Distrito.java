package com.gestionHospital.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="distrito")
public class Distrito {
    @Id
    @Column
    private int id_distrito;

    @Column
    private String nom_distrito;

    @Column
    int id_provincia;

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }

    public String getNom_distrito() {
        return nom_distrito;
    }

    public void setNom_distrito(String nom_distrito) {
        this.nom_distrito = nom_distrito;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }
}
