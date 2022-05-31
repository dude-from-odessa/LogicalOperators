package com.github.dude_from_odessa.group_exercise01;

import java.util.Scanner;

public class Program07 {

	public static void main(String[] args) {

		/*
		 * Write a java program to check whether a given number is prime or not?
		 */
		
		int num = 0;
		int x = 2;
		int check = 1;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Please enter whole number greater than 1 : ");
			num = scanner.nextInt();

		} while (num <= 1);

		for (x = 2; x < num; x++) {

			if (num % x == 0) {
				System.out.println("Number " + num + " is composite number");
				check = 2;
				break;
			}

		}
		if (check == 1) {
			System.out.println("Number " + num + " is prime number");
		}
		scanner.close();
	}

}
