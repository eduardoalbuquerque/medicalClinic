package br.com.webdevbrasil.enums;

public enum Gender {
	MASCULINE("M"), FEMALE("F");
	
	private String gender;
	
	Gender(String gender){
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
}
