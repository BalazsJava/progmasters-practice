package start.numeric;

import java.util.Scanner;

public class BiggestNumberApp {

    /**
     * Prints out the biggest number from the input.
     *
     * @param args the numbers provided by the user.
     */
    public static void main(String[] args) {
        // Implement an application that takes 3 numbers (int) in a row, then it should print the biggest number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c > b && c > a) {
            System.out.println(c);
        } else if (a > b && b < c) {
            System.out.println(a);
        } else if (b > a && c < b) {
            System.out.println(b);
        } else if (a == b && a == c) {
            System.out.println("The biggest");
        }
    }
}
