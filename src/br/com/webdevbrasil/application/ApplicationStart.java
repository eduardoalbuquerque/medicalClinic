package br.com.webdevbrasil.application;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.webdevbrasil.entities.Clerk;
import br.com.webdevbrasil.entities.Consultation;
import br.com.webdevbrasil.entities.Doctor;
import br.com.webdevbrasil.entities.HealthPlanPatient;
import br.com.webdevbrasil.entities.PrivatePatient;
import br.com.webdevbrasil.entities.PublicPatient;
import br.com.webdevbrasil.enums.BloodType;
import br.com.webdevbrasil.enums.Gender;
import br.com.webdevbrasil.enums.TypeOfConsultation;

public class ApplicationStart {
	public static void main(String[] args) {

		//clerks
		System.out.println("-".repeat(10) + " Clerk" + "-".repeat(10));
		Clerk c1 = new Clerk("Emlly", Gender.FEMALE, LocalDate.of(1982, 01, 01), null);
		System.out.println(c1);
		
		//patients
		System.out.println("-".repeat(10) + " Patients " + "-".repeat(10));
		PrivatePatient p1 = new PrivatePatient(BloodType.A_PLUS, "Eduardo", Gender.MASCULINE, LocalDate.of(1974, 4, 30),100.0f);
		HealthPlanPatient p2 = new HealthPlanPatient(BloodType.AB_PLUS, "Isaac", Gender.MASCULINE, LocalDate.of(1970, 1, 1),20.0f);
		PublicPatient p3 = new PublicPatient(BloodType.AB_MINUS, "Maria", Gender.FEMALE, LocalDate.of(2010, 3, 15),0.0f);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		//doctors
		System.out.println("-".repeat(10) + " Doctors " + "-".repeat(10));
		Doctor d1 = new Doctor("Dr. James", Gender.MASCULINE, LocalDate.of(1960, 03, 4), "123-CA", TypeOfConsultation.PEDIATRICIANS);
		Doctor d2 = new Doctor("Dr. Kira", Gender.FEMALE, LocalDate.of(1980, 11, 30), "6548-RN", TypeOfConsultation.GINAECOLOGY);
		System.out.println(d1);
		System.out.println(d2);
		
		Consultation consultation1 = new Consultation(LocalDate.of(2020, 8, 01), LocalTime.of(9, 30), d1, p1);
		Consultation consultation2 = new Consultation(LocalDate.parse("2020-08-01"), LocalTime.parse("10:00"), d1, p1);
		
		System.out.println(consultation1);
		System.out.println(consultation2);
		
	}
}
