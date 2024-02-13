package trialexam.goldbar;

import java.util.Scanner;

public class GoldBar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int size = scanner.nextInt();

            GoldBarPrinter goldBarPrinter = new GoldBarPrinter(size);
            goldBarPrinter.printGoldBar();
        }

    }

}
