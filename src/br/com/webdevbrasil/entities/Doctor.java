package br.com.webdevbrasil.entities;

import java.time.LocalDate;

import br.com.webdevbrasil.enums.Gender;
import br.com.webdevbrasil.enums.TypeOfConsultation;

public class Doctor extends Person {
	private String CRM;
	private TypeOfConsultation speciality;
	
	public Doctor(String namePerson, Gender gender, LocalDate birthDay, String CRM, TypeOfConsultation speciality) {
		super(namePerson, gender, birthDay);
		this.CRM = CRM;
		this.speciality = speciality;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public TypeOfConsultation getSpeciality() {
		return speciality;
	}

	public void setSpeciality(TypeOfConsultation speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Doctor : "+getNamePerson()
		+"\n[CRM=" + CRM + ", \nspeciality=" + speciality.getDescription() + "]\n";
	}

		
}
