package com.gestionHospital.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class GestionHospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionHospitalApplication.class, args);
	}

}
