package br.com.webdevbrasil.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.webdevbrasil.enums.BloodType;
import br.com.webdevbrasil.enums.Gender;

public class Patient extends Person {
	protected BloodType bloodType;
	protected List<MedicalRecord> patientForm = new ArrayList<>();
	
	public Patient(BloodType bloodType, String namePerson, Gender gender, LocalDate birthDay) {
		super(namePerson, gender, birthDay);
		this.bloodType = bloodType;
	}

}
