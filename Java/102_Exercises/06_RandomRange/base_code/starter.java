/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.print("Please enter a number: ");
		
		
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer:");
		int value = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first):");
		int VALUE = sc.nextInt();
		System.out.println("");
		System.out.println("Your range is " + value + " to " + VALUE + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random()*(value - VALUE) + VALUE) + ", ");
		System.out.print((int)(Math.random()*(value - VALUE) + VALUE) + ", ");
		System.out.print((int)(Math.random()*(value - VALUE) + VALUE) + ", ");
		System.out.print((int)(Math.random()*(value - VALUE) + VALUE) + ", ");
		System.out.print((int)(Math.random()*(value - VALUE) + VALUE));
		
		System.out.println("");
		System.out.println("Your range is " + VALUE + " to " + value + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random()*(VALUE - value) + value) + ", ");
		System.out.print((int)(Math.random()*(VALUE - value) + value) + ", ");
		System.out.print((int)(Math.random()*(VALUE - value) + value) + ", ");
		System.out.print((int)(Math.random()*(VALUE - value) + value) + ", ");
		System.out.print((int)(Math.random()*(VALUE - value) + value));
	}
}
