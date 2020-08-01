package br.com.webdevbrasil.enums;

public enum TypeOfConsultation {
	PEDIATRICIANS("Pediatrician",100.0f), 
	GINAECOLOGY("Ginaecology",150.0f), 
	CARDIOLOGIST("Cardiologist",250.0f), 
	NEOROLOGIST("Neoroligist",280.0f);

	private Float price;
	private String description;

	TypeOfConsultation(String description, Float price) {
		this.description = description;
		this.price = price;
	}

	public Float getPrice() {
		return price;
	}
	
	public String getDescription() {
		return description;
	}
}