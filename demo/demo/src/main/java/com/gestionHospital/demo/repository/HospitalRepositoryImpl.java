package com.gestionHospital.demo.repository;

import com.gestionHospital.demo.DTO.HospitalDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HospitalRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;
    public HospitalDTO obtenerHospitalPorId(int id) {
        StoredProcedureQuery query = entityManager
                .createStoredProcedureQuery("obtenerHospitalPorId");

        query.registerStoredProcedureParameter("P_idHospital", Integer.class, ParameterMode.IN);
        query.setParameter("P_idHospital", id);

        List<Object[]> result = query.getResultList();

        if (result.isEmpty()) return null;

        Object[] row = result.get(0);

        return new HospitalDTO(
                ((Integer) row[0]),
                (String) row[1],
                (String) row[2],
                (String) row[3],
                (String) row[4],
                (String) row[5]
        );
}



}