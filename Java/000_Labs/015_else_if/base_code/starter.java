/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int number = (int)(Math.random()*(1000)+1);
	System.out.println(number);
	System.out.println("I am thinking of a number between 1 and 1000");
	System.out.print("Try to guess the number im thinking: ");
	int n = sc.nextInt();
    System.out.println("You entered: " + n);
	if (n < number) {
		
		System.out.println("That is too low Sorry");
		
	}
	
	if (n > number) {
		
		System.out.println("That is too High Sorry");
		
	}
	
	else if (n == number){
		
		System.out.println("That is the number im thinking great job!");
		
	}
	
	}
}
