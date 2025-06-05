package com.gestionHospital.demo.entity;

import jakarta.persistence.*;


@NamedStoredProcedureQuery(
        name = "Hospital.registrarHospital",
        procedureName = "SP_HOSPITAL_REGISTRAR",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_nomHospital", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idGerente", type = int.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idCondicion", type = int.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idSede", type = int.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idDistrito", type = int.class)
        }
)
@NamedStoredProcedureQuery(
        name = "Hospital.actualizarHospital",
        procedureName = "SP_HOSPITAL_ACTUALIZAR",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idHospital", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_nomHospital", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idGerente", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idCondicion", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idSede", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idDistrito", type = Integer.class)
        }
)
@NamedStoredProcedureQuery(
        name = "Hospital.obtenerHospitalPorId",
        procedureName = "obtenerHospitalPorId",
        resultClasses = Hospital.class,
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_idHospital", type = Integer.class)
        }
)
@Entity
@Table(name="hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_hospital;

    @Column
    private String nom_hospital;

    @Column
    private int id_gerente;

    @Column
    private int id_condicion;

    @Column
    private int id_sede;

    @Column
    private int id_distrito;

//getters y setters


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

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
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

    public int getId_gerente() {
        return id_gerente;
    }

    public void setId_gerente(int id_gerente) {
        this.id_gerente = id_gerente;
    }


}


