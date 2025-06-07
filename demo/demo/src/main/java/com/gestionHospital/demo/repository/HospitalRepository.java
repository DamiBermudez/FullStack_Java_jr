package com.gestionHospital.demo.repository;


import com.gestionHospital.demo.DTO.HospitalDTO;
import com.gestionHospital.demo.entity.Hospital;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Integer> {

    @Procedure(name = "Hospital.registrarHospital")
    void registrarHospital(String P_nomHospital, int P_idGerente, int P_idCondicion, int P_idSede, int P_idDistrito);

    @Procedure(procedureName = "actualizarHospital")
    void actualizarHospital(
            int p_id_hospital,
            String p_nom_hospital,
            String p_nom_condicion,
            String p_nom_gerente,
            String p_nom_sede,
            String p_nom_distrito
    );

    @Procedure(name = "Hospital.eliminarHospital")
    void eliminarHospital(int P_idHospital);

    HospitalDTO obtenerHospitalPorId(int id);
}




