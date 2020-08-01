package br.com.webdevbrasil.entities;

import java.time.LocalDate;
import java.time.Period;

import br.com.webdevbrasil.enums.Gender;

public abstract class Person {
	private String namePerson;
	private Gender gender;
	private LocalDate birthDay;
	
	public Person(String namePerson, Gender gender, LocalDate birthDay) {
		super();
		this.namePerson = namePerson;
		this.gender = gender;
		this.birthDay = birthDay;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	
	public Period calcAge() {
		LocalDate now = LocalDate.now();
		Period period = Period.between(birthDay, now);
		return period;
	}

	
}
