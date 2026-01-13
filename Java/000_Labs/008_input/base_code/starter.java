/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		double value = sc.nextInt();
		
		System.out.println("Here are the next 5 multiples of " + value + "!");
		System.out.print(value + ", ");
		System.out.print(value*2 + ", ");
		System.out.print(value*3 + ", ");
		System.out.print(value*4 + ", ");
		System.out.print(value* 5 + " ");
		System.out.println(value* 6 + " ");
		System.out.println("Here are the next " + value + " numbers!");
		System.out.print(value + ", ");
		System.out.print(value + 1 + ", ");
		System.out.print(value + 2 + ", ");
		System.out.print(value + 3  + ", ");
		System.out.print(value + 4 + ", ");
		System.out.println(value + 5);
		System.out.println("Here is " + value + " divided by 100!");
		System.out.println(value / 100);
		System.out.println("Here is " + value + " divided by 10!");
		System.out.println(value / 10);
		
	}
}
