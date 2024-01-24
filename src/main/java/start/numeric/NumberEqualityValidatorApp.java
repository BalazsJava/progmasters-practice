package start.numeric;

import java.util.Scanner;

public class NumberEqualityValidatorApp {

    /*
    Make an application that asks for 3 numbers.

    If all of them are equal, print: "These numbers are equal"
    If all of them are different, print: "These numbers are unique"
    Otherwise, print: "These numbers include equal and different ones as well"

    --------------- Examples ---------------

    First: 1
    Second: 1
    Third: 1
    Result: "These numbers are equal"

    First: 1
    Second: 2
    Third: 3
    Result: "These numbers are unique"

    First: 2
    Second: 2
    Third: 3
    Result: "These numbers include equal and different ones as well"
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int egy = sc.nextInt();
        int ketto = sc.nextInt();
        int harom = sc.nextInt();

        if (egy == ketto && ketto == harom) {
            System.out.println("Minden szám egyenlő");
        } else if (egy != ketto && harom != egy && harom != ketto) {
            System.out.println("Minden szám különbözik");
        } else {
            System.out.println("Vannak egyenlők és különbözők is");
        }
    }

}
