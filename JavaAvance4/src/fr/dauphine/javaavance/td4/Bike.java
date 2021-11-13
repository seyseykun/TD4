package fr.dauphine.javaavance.td4;

public class Bike implements Vehicle {
	
	private final String brand;
	private static int value = 100;
	
	public Bike(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}

}
