package com.fullcreative.dayonetask;


import java.util.InputMismatchException;
import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Enter pyramid Input:");
		
		try {
		int a = s.nextInt();
		
		int tempvar = a;

		while (a >= 1) {

			int count = 0;
			int input = a;
			//loops will print space a-1 & store a-1 to count
			while (input > 1) {
				System.out.print(" ");
				input--;
				count++;
			}
			
			//tempvar is my constant holds a & count would be decreases every outer loop execute
			//5>4      *
			//5>3     * *
			//5>2    * * *
			//5>1   * * * * 
			//5>0  * * * * *
			
			while (tempvar > count) {
				//System.out.println(count);
				System.out.print("* ");
				count++;
			}

			System.out.println();
			a--;
		}
		}
		catch(InputMismatchException e){
			System.out.println("Check the Input type"+e);
		}
	

	}

}
