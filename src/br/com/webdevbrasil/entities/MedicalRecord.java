package br.com.webdevbrasil.entities;

import java.time.LocalDate;

import br.com.webdevbrasil.enums.TypeOfConsultation;

public class MedicalRecord {
	private LocalDate dateLastConsult;
	private TypeOfConsultation typeOfConsultation;
	private String diagnosis;
	
	public MedicalRecord(LocalDate dateLastConsult, TypeOfConsultation typeOfConsultation, String diagnosis) {
		this.dateLastConsult = dateLastConsult;
		this.typeOfConsultation = typeOfConsultation;
		this.diagnosis = diagnosis;
	}

	public LocalDate getDateLastConsult() {
		return dateLastConsult;
	}

	public void setDateLastConsult(LocalDate dateLastConsult) {
		this.dateLastConsult = dateLastConsult;
	}

	public TypeOfConsultation getTypeOfConsultation() {
		return typeOfConsultation;
	}

	public void setTypeOfConsultation(TypeOfConsultation typeOfConsultation) {
		this.typeOfConsultation = typeOfConsultation;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	
}
