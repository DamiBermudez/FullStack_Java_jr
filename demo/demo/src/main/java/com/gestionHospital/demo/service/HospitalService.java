package com.gestionHospital.demo.service;

import com.gestionHospital.demo.DTO.HospitalDTO;
import com.gestionHospital.demo.entity.Hospital;
import com.gestionHospital.demo.repository.HospitalRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public void registrarHospital(String nomHospital, int idGerente, int idCondicion, int idSede, int idDistrito) {
        hospitalRepository.registrarHospital(nomHospital, idGerente, idCondicion, idSede, idDistrito);
    }
    @Transactional
    public Hospital obtenerHospitalPorId(int id) {
        return hospitalRepository.obtenerHospitalPorId(id);
    }
}
