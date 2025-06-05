package com.gestionHospital.demo.repository;

import com.gestionHospital.demo.entity.Condicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionRepository extends JpaRepository<Condicion, Integer>{
}
