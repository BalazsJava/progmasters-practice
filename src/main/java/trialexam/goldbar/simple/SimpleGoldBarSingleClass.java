package trialexam.goldbar.simple;

import java.util.Scanner;

public class SimpleGoldBarSingleClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int size = scanner.nextInt();

            printGoldBar(size);
        }
    }

    public static void printGoldBar(int size) {
        printTop(size);
        printMid(size);
        printBottom(size);
    }

    private static void printTop(int size) {
        printNTimes("/", 1);
        printNTimes("-", size - 2);
        printNTimes("\\", 1);

        System.out.println(); // Next line
    }

    private static void printMid(int size) {
        for (int i = 0; i < size - 2; i++) {
            printNormalMidLine(size);
            System.out.println(); // Next line
        }
    }

    private static void printBottom(int size) {
        printNTimes("\\", 1);
        printNTimes("-", size - 2);
        printNTimes("/", 1);

        System.out.println(); // Next line
    }

    private static void printNormalMidLine(int size) {
        printNTimes("|", 1);
        printNTimes(" ", size - 2);
        printNTimes("|", 1);
    }

    private static void printNTimes(String charToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }

}
