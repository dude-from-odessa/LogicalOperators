package com.github.dude_from_odessa.group_exercise01;

public class Program09 {

	public static void main(String[] args) {
		
		/*
		 * Maximum and minimum number in the array?
		 * 
		 */
		
		int[] number = {1,24,35,4,556,6,7,83,9};
		int max=number[0];
		int min=number[0];
		for(int check:number) {
			if(check>=max) {
				max = check;
			}
		} System.out.println(max);
		
	}

}
