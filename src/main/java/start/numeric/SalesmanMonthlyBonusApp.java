package start.numeric;

import java.util.Scanner;

public class SalesmanMonthlyBonusApp {

    public static void main(String[] args) {
        // Salesmen get 10% bonus but only if their sales are over 1.000.000 HuF in that month

        // Implementation:
        // - Take the monthly sales from the console (int)
        // - Print out the bonus (int)

        // Example
        // Input: 500 -> Output: 0
        // Input: 1000000 -> Output: 100000

        Scanner sc = new Scanner(System.in);
        System.out.println("Írd be a bevételed: ");
        int bevétel = sc.nextInt();

        if (bevétel >= 1000000) {
            System.out.println("Jutalék: " + bevétel / 10);
        } else if (bevétel < 1000000) {
            System.out.println("Jutalék:" + 0);
        }

    }
}
