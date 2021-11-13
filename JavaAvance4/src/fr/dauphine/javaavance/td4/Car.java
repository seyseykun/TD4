package fr.dauphine.javaavance.td4;

public class Car implements Vehicle {
	private final String brand;
	private final long value;
	private final int vétusté;
	private Discount discount;
	
	public Car(String brand, long value) {
		//faire une exception
		if (value < 0) {
			throw new IllegalArgumentException("A car can't have a negative value. ");
		}
		this.brand = brand;
		this.value = value;
		this.vétusté = 0;
		this.discount = null;
	}
	
	public Car(String brand, long value, int vétusté) {
		if (value < 0) {
			throw new IllegalArgumentException("A car can't have a negative value. ");
		}
		this.brand = brand;
		this.value = value;
		this.vétusté = vétusté;
		this.discount = null;
	}
	
	public boolean equals(Car c) {
		if(brand == c.brand && value == c.value && vétusté == c.vétusté){
			return true;
		}
		return false;
	}
	
	
	public String toString() {
		return "La marque de la voiture est " + getBrand() + " et elle vaut " + getValue() + " euros. ";
	}
	
	public String getBrand() {
		return brand;
	}
	
	public long getValue() {
		if(discount == null) {
			return value-(1000*vétusté);
		}
		return discount.getValue();
	}
	
	public Discount getDiscount() {
		return discount;
	}
	
	public void setDiscount(Discount d) {
		this.discount = d;
	}
	
}