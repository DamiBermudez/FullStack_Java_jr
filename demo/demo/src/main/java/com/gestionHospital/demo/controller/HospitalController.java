package com.gestionHospital.demo.controller;


import com.gestionHospital.demo.DTO.HospitalDTO;
import com.gestionHospital.demo.entity.Hospital;
import com.gestionHospital.demo.repository.HospitalRepository;
import com.gestionHospital.demo.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/hospitales")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;
    @Autowired
    private HospitalRepository hospitalRepository;

    @PostMapping("/registrar")
    public String registrarHospital(
            @RequestParam String hospital,
            @RequestParam int idGerente,
            @RequestParam int idCondicion,
            @RequestParam int idSede,
            @RequestParam int idDistrito) {
        hospitalService.registrarHospital(hospital, idGerente, idCondicion, idSede, idDistrito);
        return "El nuevo hospital registró satisfactoriamente!";
    }

    @GetMapping("/{id}")
    public ResponseEntity<HospitalDTO> obtenerHospitalPorId(@PathVariable int id) {
        HospitalDTO hospital = hospitalService.obtenerHospitalPorId(id);
        if (hospital != null) {
            return ResponseEntity.ok(hospital);
        } else {
            return ResponseEntity.notFound().build();
        }


    }

    @PutMapping("/{id}")
    public void actualizarHospital(@PathVariable int id, @RequestBody HospitalDTO dto) {
        dto.setIdHospital(id);
        hospitalService.actualizarHospital(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarHospital(@PathVariable Integer id) {
        try {
            hospitalService.eliminarHospital(id);
            return ResponseEntity.ok("Hospital eliminado correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al eliminar hospital: " + e.getMessage());
        }
    }
}
