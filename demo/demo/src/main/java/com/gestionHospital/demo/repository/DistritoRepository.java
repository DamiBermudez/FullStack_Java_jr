package com.gestionHospital.demo.repository;

import com.gestionHospital.demo.entity.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DistritoRepository extends JpaRepository<Distrito, Integer> {
}
