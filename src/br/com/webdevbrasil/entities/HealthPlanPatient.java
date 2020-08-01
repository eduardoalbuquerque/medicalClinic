package br.com.webdevbrasil.entities;

import java.time.LocalDate;

import br.com.webdevbrasil.enums.BloodType;
import br.com.webdevbrasil.enums.Gender;

public class HealthPlanPatient extends Patient{
	private Float txConsult;

	public HealthPlanPatient(BloodType bloodType, String namePerson, Gender gender, LocalDate birthDay,
			Float txConsult) {
		super(bloodType, namePerson, gender, birthDay);
		this.txConsult = txConsult;
	}

	public Float getTxConsult() {
		return txConsult;
	}

	public void setTxConsult(Float txConsult) {
		this.txConsult = txConsult;
	}

	@Override
	public String toString() {
		return "Patient : "+ getNamePerson() + "(HP)"
				+ "\nAge : " + calcAge().getYears() + "Blood Type : " + bloodType.getBloodType()
				+ "\nGender : " + getGender().getGender() + "[tx per Consut" + txConsult + "]\n"; 


	}
	
	
	
}
