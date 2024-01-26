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
        System.out.println("Ird be a beveteled: ");
        int bevetel = sc.nextInt();

        if (bevetel >= 1000000) {
            System.out.println("Jutalek: " + bevetel / 10);
        } else if (bevetel < 1000000) {
            System.out.println("Jutalek:" + 0);
        }

        // EXTRA TASK:
        // Modify the application using 15% bonus, also it should support more accurate results up to 2 decimals
        // Example:
        // Input: 3333333 -> Output: 499999.95
    }
}
