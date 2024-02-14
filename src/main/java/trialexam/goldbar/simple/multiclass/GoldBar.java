package trialexam.goldbar.simple.multiclass;

import java.util.Scanner;

public class GoldBar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int size = scanner.nextInt();

            SimpleGoldBarPrinter printer = new SimpleGoldBarPrinter(size);
            printer.printGoldBar();
        }
    }

}
