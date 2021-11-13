package fr.dauphine.javaavance.td4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class Garage {

	private ArrayList<Vehicle> garage;
	private static int idGarage;
	
	public Garage() {
		this.garage = new ArrayList<Vehicle>();
		idGarage++;
	}
	
	public void addCar(Car car) {
		Objects.requireNonNull(car, "car must not be null");
		garage.add(car);
		
		Comparator c = new Comparator() {
			
			public int compare(Object o1, Object o2) {
                Car c1 = (Car)o1;
                Car c2 = (Car)o2;
                return (c1.getBrand().compareTo(c2.getBrand()) + ((int)c1.getValue()- (int)c2.getValue()));
			}
		};
		
		garage.sort(c);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); //Un StringBuilder est un Objet similaire à un String mais mutable.
		Iterator<Vehicle> iter = garage.iterator();
		while(iter.hasNext()) {
			sb.append(iter.next().toString());
		}
		return sb.toString();
	}
	
	public double valueGarage() {
		double valueGarage = 0;
		Iterator<Vehicle> iter = garage.iterator();
		while(iter.hasNext()) {
			valueGarage += iter.next().getValue();
		}
		return valueGarage;
	}
	
	public String firstCarByBrand(String brand) {
		String c = "The garage doesn't contain any car of this brand.";
		for(Vehicle car : garage) {
			if(car.getBrand() == brand) {
				return c = car.toString();
			}
		}
		return c;
	}
	
	public void remove(Vehicle v) {
		garage.remove(v);
	}
	
	
	public void protectionism(String brand) {
		Iterator<Vehicle> iter = garage.iterator();
		while(iter.hasNext()) {
			Vehicle s = iter.next();
			if(s.getBrand() == brand) {
				iter.remove();
			}
		}
	}
	
	public boolean equals(Garage g) {
		return garage.equals(g.garage);
	}
	
	public ArrayList<Vehicle> getGarage() {
		return garage;
	}
	
	public int getIdGarage() {
		return idGarage;
	}
	
	
}
