package com.example.demo;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.controller.EnregistrementController;
import com.example.demo.modele.Enregistrement;

@SpringBootApplication
public class HeartAttackApplication {
	
	@Autowired
	private EnregistrementController enregistrementController;

	public static void main(String[] args) {
		SpringApplication.run(HeartAttackApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
	return args -> {
		
		Enregistrement enregistrement1 = enregistrementController.generateData();
		Enregistrement enregistrement2 = enregistrementController.generateData();
		Enregistrement enregistrement3 = enregistrementController.generateData();
		Enregistrement enregistrement4 = enregistrementController.generateData();
		
		};
	}

}
