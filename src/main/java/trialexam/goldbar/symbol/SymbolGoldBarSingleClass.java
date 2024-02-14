package trialexam.goldbar.symbol;

import java.util.Scanner;

public class SymbolGoldBarSingleClass {

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
        int symbolLine = calculateMiddleOfSideSize(size); // Can't print in middle at even size

        for (int i = 0; i < (size - 2); i++) {
            if (i == symbolLine) {
                printSymbolMidLine(size);
            } else {
                printNormalMidLine(size);
            }
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

    private static void printSymbolMidLine(int size) {
        int spacesToSymbol = calculateMiddleOfSideSize(size); // Can't print in middle at even size

        printNTimes("|", 1);
        printNTimes(" ", spacesToSymbol);
        printNTimes("G", 1);
        printNTimes(" ", (size - 2) / 2);
        printNTimes("|", 1);
    }

    private static int calculateMiddleOfSideSize(int size) {
        int halfSideSize = (size - 2) / 2;
        return size % 2 == 0 ? halfSideSize - 1 : halfSideSize;
    }

    private static void printNTimes(String charToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }

}
