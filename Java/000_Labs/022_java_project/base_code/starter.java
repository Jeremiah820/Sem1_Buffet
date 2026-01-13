import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int money = 100;
        System.out.println("Slot Machine🎰. You start with $" + money);

        while (money > 0) {
            System.out.print("Play? (Y/N): ");
            String a = in.next();               

            if (!(a.equals("Y") || a.equals("y") || a.equals("Yes") || a.equals("yes") || a.equals("1"))) {
                break;                          
            }

            System.out.print("Enter wager (1 to " + money + "): ");
            int w = in.nextInt();               

            if (w < 1 || w > money) {           
                System.out.println("Invalid wager.");
                continue;
            }

            
            int x = (int) (Math.random() * 2) + 1;
            int y = (int) (Math.random() * 2) + 1;
            int z = (int) (Math.random() * 2) + 1;

            System.out.println("Spin: [" + x + " " + y + " " + z + "]");

            if (x == y && y == z) {
                money += w * 3;                 // triple
                System.out.println("JACKPOT! +" + (w * 3));
            } else if (x == y || x == z || y == z) {
                money += w * 2;                 // double
                System.out.println("Pair! +" + (w * 2));
            } else {
                money -= w;                     // lose
                System.out.println("No match -" + w);
            }

            System.out.println("Money: $" + money);
        }

        System.out.println("You leave with $" + money + ". Goodbye!");
        in.close();
    }
}
