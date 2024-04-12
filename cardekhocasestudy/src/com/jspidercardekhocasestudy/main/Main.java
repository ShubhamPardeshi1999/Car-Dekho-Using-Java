package com.jspidercardekhocasestudy.main;

import java.util.Scanner;

import com.jspidercardekhocasestudy.operation.Operation;

public class Main {

	
	public static void main(String[] args) {

		boolean value = true;
		Scanner sc = new Scanner(System.in);
		Operation operation = new Operation();

		while (value) {

			System.out.println("1. Add Car\n" 
							+ "2. View All Car\n" 
							+ "3. Search Car By Select Price Range\n" 
							+ "4. Search Car By Id\n" 
							+ "5. Exit\n" 
							+ "Choose number");

			int count = sc.nextInt();

			switch (count) {

			case 1:
				operation.addCar();
				break;

			case 2:
				operation.viewAllCar();
				break;

			case 3:
				operation.carRange();
				break;

			case 4:
				operation.searchCarById();
				break;
				
			case 5:
				value = false;
				System.out.println("thanx to me");
				break;

			}

		}

	}
	
}
