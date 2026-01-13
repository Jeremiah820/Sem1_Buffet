/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("🌮Welcome To Jones Taco Shop🌮");
		System.out.println("1. 🌮 Taco - $4.00 ");
		System.out.println("2. 🌯 Burrito - $5.00 ");
		System.out.println("3. 🫔 Tamale - $3.00 ");
		System.out.println("Who's order is this?");
		String name = sc.nextLine();
		System.out.println("How many Tacos?");
		int item1 = sc.nextInt();
		System.out.println("How many Burritos?");
		int item2 = sc.nextInt();
		System.out.println("How many Tamale?");
		int item3 = sc.nextInt();
		
		double price1 = item1 * 8.00;
		double price2 = item2 * 10.00;
		double price3 = item3 * 6.00;
		
		System.out.println("How much would you like to tip?");
		double tip = sc.nextDouble();
		
		System.out.println("How much do you want to tip?");
		double total = price1 + price2 + price3 + tip;
		
		System.out.println();
		System.out.println("--------------------------->");
		System.out.println(name + "s Receipt");
		System.out.println(item1 + "X Taco = $" + price1);
		System.out.println(item2 + "X Burrito = $" + price2);
		System.out.println(item3 + "X Tamale = $" + price3);
		System.out.println("---------------------------");
		System.out.println("The Grand Total is - " + total);
	}
}
