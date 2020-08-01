package br.com.webdevbrasil.entities;

import java.time.LocalDate;

import br.com.webdevbrasil.enums.BloodType;
import br.com.webdevbrasil.enums.Gender;

public class PrivatePatient extends Patient{
	private Float txConsult;

	public PrivatePatient(BloodType bloodType, String namePerson, Gender gender, LocalDate birthDay, Float txConsult) {
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
		return "Patient : " + getNamePerson() + "(PP)"
				+ "\nAge : " + calcAge().getYears() +" Years" + " Blood Type : " + bloodType.getBloodType()
				+ "\nGender : " + getGender().getGender()
				+ " [tx Per Consult=" + txConsult + "%]\n";
	}
	
	
	
}
