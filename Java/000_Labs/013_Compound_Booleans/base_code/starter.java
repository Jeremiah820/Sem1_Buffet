/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		int a = ((int)(Math.random()*(100)+1));
		int b = ((int)(Math.random()*(100)+1));
		int c = ((int)(Math.random()*(100)+1));
		
		//Which numbers the smallest
		if(a < b && a < c){
			
			System.out.println("a is the smallest");
			
		}
			
		if(b < a && b < c){
			
			System.out.println("b is the smallest");
			
		}
		
		if (c < b && c < a){
			
			System.out.println("c is the smallest");
			
		}
		
		//Which numbers the biggest
		if (a > b & a > c){
			
			System.out.println("a is the biggest");
			
		}
		
		if (b > a && b > c){
			
			System.out.println("b is the biggest");
			
		}
		
		if (c > a &&c > b){
			
			System.out.println("c is the biggest");
			
		}
		
		
	}
}
