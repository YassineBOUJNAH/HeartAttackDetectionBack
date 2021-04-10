package com.example.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modele.Enregistrement;
import com.example.demo.repository.EnregistrementRepository;

@Service
public class EnregistrementService {

	@Autowired
	private EnregistrementRepository enregistrementRepository;

	// Generate Random Data
	public Enregistrement generateData() {

		Random random = new Random();
		int sex = random.nextInt(2);
		int cp = random.nextInt(5);
		int thalach = random.nextInt(200);
		float oldpeak = random.nextFloat();
		int slope = random.nextInt(7);
		int ca = random.nextInt(10);
		int target = random.nextInt(200);

		Enregistrement enregistrement = new Enregistrement(sex, cp, thalach, oldpeak, slope, ca, target);
		return enregistrementRepository.save(enregistrement);
	}

	// Get All Enregistrement
	public List<Enregistrement> getAllEnregistrement() {
		return (List<Enregistrement>) enregistrementRepository.findAll();
	}

	// Get Last Enregistrement
	public Enregistrement getEnregistrementActuel() {
		return enregistrementRepository.findEnregistrementActuel();
	}

	// Get Data Score
	public List<Integer> getScoreData() {
		return enregistrementRepository.findScoreData();
	}

	// Get total of measures
	public int getTotalMeasures() {
		return enregistrementRepository.findCountEnregistrements();
	}

}
