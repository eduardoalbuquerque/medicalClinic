package br.com.webdevbrasil.enums;

public enum BloodType {
	A_PLUS("a+"),
	A_MINUS("a-"),
	B_PLUS("b+"),
	B_MINUS("b-"),
	AB_PLUS("ab+"),
	AB_MINUS("ab-"),
	O_PLUS("o+"),
	O_MINUS("o-");
	
	private String bloodType;
	
	private BloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	public String getBloodType() {
		return this.bloodType;
	}
}
