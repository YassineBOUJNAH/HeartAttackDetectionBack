package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modele.Enregistrement;
import com.example.demo.service.EnregistrementService;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class EnregistrementController {

	@Autowired
	private EnregistrementService enregistrementService;

	@PostMapping("/save-enregistrement")
	public Enregistrement generateData() {
		return enregistrementService.generateData();
	}

	@GetMapping("/enregistrements")
	public List<Enregistrement> getAllEnregistrement() {
		return enregistrementService.getAllEnregistrement();
	}

	@GetMapping("/enregistrement-actuel")
	public Enregistrement getEnregistrementActuel() {
		return enregistrementService.getEnregistrementActuel();
	}

	@GetMapping("/score-data")
	public List<Integer> getScoreData() {
		return enregistrementService.getScoreData();
	}

	@GetMapping("/total-data")
	public int getTotalMeasures() {
		return enregistrementService.getTotalMeasures();
	}

}
