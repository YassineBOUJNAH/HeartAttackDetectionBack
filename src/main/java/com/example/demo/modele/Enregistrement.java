package com.example.demo.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Enregistrement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int sex;
	private int cp;
	private int thalach;
	private float oldpeak;
	private int slope;
	private int ca;
	private int target;
	
	public Enregistrement(int sex, int cp, int thalach, float oldpeak, int slope, int ca, int target) {
		
		super();
		this.sex = sex;
		this.cp = cp;
		this.thalach = thalach;
		this.oldpeak = oldpeak;
		this.slope = slope;
		this.ca = ca;
		this.target = target;
	}
	
	
	

}
