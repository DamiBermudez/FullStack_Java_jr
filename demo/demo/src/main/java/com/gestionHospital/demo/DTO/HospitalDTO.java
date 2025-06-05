package com.gestionHospital.demo.DTO;

public class HospitalDTO {
    private int id_hospital;
    private String nom_hospital;
    private int id_gerente;
    private int id_condicion;
    private int id_sede;
    private int id_distrito;

    public HospitalDTO(int idHospital, String nomHospital, int idCondicion, int idDistrito, int idSede) {
    }

    public int getId_hospital() {
        return id_hospital;
    }

    public void setId_hospital(int id_hospital) {
        this.id_hospital = id_hospital;
    }

    public String getNom_hospital() {
        return nom_hospital;
    }

    public void setNom_hospital(String nom_hospital) {
        this.nom_hospital = nom_hospital;
    }

    public int getId_gerente() {
        return id_gerente;
    }

    public void setId_gerente(int id_gerente) {
        this.id_gerente = id_gerente;
    }

    public int getId_condicion() {
        return id_condicion;
    }

    public void setId_condicion(int id_condicion) {
        this.id_condicion = id_condicion;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }
}
