package com.github.dude_from_odessa.group_exercise01;

public class Program09 {

	public static void main(String[] args) {

		/*
		 * Maximum and minimum number in the array?
		 * 
		 */

		int[] number = { 1535, 2415, 3544, 45432, 55645, 6, 74543, 8345, 95443 };
		int max = number[0];
		int min = number[0];
		for (int check : number) {
			if (check > max) {
				max = check;
			} else if (check < min) {
				min = check;
			}
		}
		System.out.println("Maximum number of array is " + max);
		System.out.println("Minimum number of array is " + min);

	}

}
