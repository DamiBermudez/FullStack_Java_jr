package com.gestionHospital.demo.repository;


import com.gestionHospital.demo.entity.Hospital;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Integer> {

    @Procedure(name = "Hospital.registrarHospital")
    void registrarHospital(String P_nomHospital, int P_idGerente, int P_idCondicion, int P_idSede, int P_idDistrito);

    @Procedure(name="Hospital.obtenerHospitalPorId")
    Hospital obtenerHospitalPorId(@Param("P_idHospital") int id);

    @Procedure(name = "Hospital.actualizarHospital")
    void actualizarHospital(Integer P_idHospital, String P_nomHospital, Integer P_idGerente, Integer P_idCondicion, Integer P_idSede, Integer P_idDistrito);

}



