package br.com.webdevbrasil.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consultation {
	private LocalDate ConsultDate;
	private LocalTime ConsultTime;
	private Doctor doctor;
	private Patient patient;
	public Consultation(LocalDate consultDate, LocalTime consultTime, Doctor doctor, Patient patient) {
		super();
		ConsultDate = consultDate;
		ConsultTime = consultTime;
		this.doctor = doctor;
		this.patient = patient;
	}
	public LocalDate getConsultDate() {
		return ConsultDate;
	}
	public void setConsultDate(LocalDate consultDate) {
		ConsultDate = consultDate;
	}
	public LocalTime getConsultTime() {
		return ConsultTime;
	}
	public void setConsultTime(LocalTime consultTime) {
		ConsultTime = consultTime;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Consultation [ConsultDate=" + ConsultDate + ", ConsultTime=" + ConsultTime + ", doctor=" + doctor
				+ ", patient=" + patient + "]";
	}
	
	
}
