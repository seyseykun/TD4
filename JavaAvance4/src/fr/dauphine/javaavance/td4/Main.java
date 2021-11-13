package fr.dauphine.javaavance.td4;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		Car c1 = new Car("Mercedes", 10000, 1);
		Car c2 = new Car("Audi", 2000);
		Car c3 = new Car("Audi", 3000);
		Car c4 = new Car("Audi", 4000);
		Car c5 = new Car("peugeot", 10000);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		Garage g1 = new Garage();
		g1.addCar(c1);
		g1.addCar(c2);
		g1.addCar(c3);
		g1.addCar(c4);
		//g1.addCar(c5);
		
		System.out.println(g1.valueGarage());
		
		
		/*
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
		
		
		ArrayList<Car> list = new ArrayList<>(); 
		list.add(a);
		list.add(b);
		list.add(c);
		
		System.out.println("\n" + list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c));
		*/
		
		System.out.println("\n" + g1.toString());
		g1.protectionism("Audi");
		System.out.println("\n" + g1.toString());
		
	}
}
