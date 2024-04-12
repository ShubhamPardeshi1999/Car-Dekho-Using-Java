package com.jspidercardekhocasestudy.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspidercardekhocasestudy.entity.Car;

public class Operation {

	ArrayList<Car> cars = new ArrayList<Car>();

	public void addCar() {

		Scanner sc = new Scanner(System.in);
		Car car = new Car();

		System.out.println("Enter Car ID");
		car.setId(sc.nextInt());
		System.out.println("Enter Car Name");
		car.setName(sc.next());
		System.out.println("Enter Car Colour");
		car.setColour(sc.next());
		System.out.println("Enter Fuel Type");
		car.setFuelType(sc.next());
		System.out.println("Enter Car Price");
		car.setPrice(sc.nextDouble());
		cars.add(car);
		System.out.println(cars);

	}

	public void viewAllCar() {
		

		if(cars.isEmpty()) {
			System.out.println("Cars not found \n");
			
		}else {
			
			for (Car car : cars) {
				System.out.println("Cars list");
				System.out.println(car);
				
			}
			
		}

	}

	public void carRange() {

		double value1;
		double value2;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Starting Price");
		value1 = scanner.nextDouble();
		System.out.println("Enter Ending of Price");
		value2 = scanner.nextDouble();

		if(cars.isEmpty()) {
			System.out.println("Cars not found \n");
			
		}else {
			
			for (Car car : cars) {
				
				if (car.getPrice() >= value1 && car.getPrice() <= value2) {
					System.out.println(car);
				}
			}
		}
	}

	public void searchCarById() {

		System.out.println("Enter Car Id");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for (Car car : cars) {
			if (car.getId() == num) {
				System.out.println(car);
			}
			
		}
		if(cars == null) {
			System.out.println("Invalid Car Id");
		}

	}

}







