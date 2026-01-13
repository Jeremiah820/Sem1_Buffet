/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int n = in.nextInt();

        
        for (int i = 1; i <= n; i++)
            System.out.println("*".repeat(i));

        
        System.out.println("Reversed Star:");
        for (int i = 1; i <= n; i++)
            System.out.println(" ".repeat(n - i) + "*".repeat(i));
    }
}
