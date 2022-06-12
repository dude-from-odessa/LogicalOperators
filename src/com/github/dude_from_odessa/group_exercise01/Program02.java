package com.github.dude_from_odessa.group_exercise01;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {

		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter number of coutries : ");
		int y = scanner.nextInt();
		int x = 2;
		String[][] array = new String[x][y];
		scanner.nextLine();

		for (int index = 0; index < array[0].length; index++) {
			System.out.print("Please enter name of the country : ");
			array[0][index] = scanner.nextLine();
			System.out.print("Please enter capital of " + array[0][index] + " : ");
			array[1][index] = scanner.nextLine();
		}

		for (int z = 0; z < array[0].length; z++) {
			System.out.println("The capital of " + array[0][z] + " is " + array[1][z]);
		}
		scanner.close();
	}

}
