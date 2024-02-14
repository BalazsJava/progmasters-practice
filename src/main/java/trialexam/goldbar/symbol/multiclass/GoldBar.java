package trialexam.goldbar.symbol.multiclass;

import java.util.Scanner;

public class GoldBar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int size = scanner.nextInt();

            SymbolGoldBarPrinter goldBarPrinter = new SymbolGoldBarPrinter(size);
            goldBarPrinter.printGoldBar();
        }

    }

}
