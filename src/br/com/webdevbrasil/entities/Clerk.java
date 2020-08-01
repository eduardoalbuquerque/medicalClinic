package br.com.webdevbrasil.entities;

import java.time.LocalDate;

import br.com.webdevbrasil.enums.Gender;

public class Clerk extends Person {
	private String register;
	
	public Clerk(String namePerson, Gender gender, LocalDate birthDay, String register) {
		super(namePerson, gender, birthDay);
		this.register = register;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	@Override
	public String toString() {
		return "Clerk : " + getNamePerson() +"\n[register=" + register + "]";
	}

	
	
}
