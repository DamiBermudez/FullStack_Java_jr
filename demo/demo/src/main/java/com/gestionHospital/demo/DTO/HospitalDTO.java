package com.gestionHospital.demo.DTO;

public class HospitalDTO {
    private int idHospital;
    private String hospital;
    private String condicion;
    private String gerente;
    private String sede;
    private String distrito;


    public HospitalDTO(int idHospital, String hospital, String condicion, String gerente, String sede, String distrito) {
        this.idHospital = idHospital;
        this.condicion = condicion;
        this.gerente = gerente;
        this.hospital = hospital;
        this.sede = sede;
        this.distrito = distrito;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public String getCondicion() {
        return condicion;
    }

    public String getHospital() {
        return hospital;
    }

    public String getGerente() {
        return gerente;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getSede() {
        return sede;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
}

