package trialexam.goldbar.simple.multiclass;

public class SimpleGoldBarPrinter {

    private final int sideSize;

    public SimpleGoldBarPrinter(int size) {
        this.sideSize = size - 2;
    }

    public void printGoldBar() {
        printTop();
        printMid();
        printBottom();
    }

    private void printTop() {
        printNTimes("/", 1);
        printNTimes("-", sideSize);
        printNTimes("\\", 1);

        System.out.println(); // Next line
    }

    private void printMid() {
        for (int i = 0; i < sideSize; i++) {
            printNormalMidLine();
            System.out.println(); // Next line
        }
    }

    private void printBottom() {
        printNTimes("\\", 1);
        printNTimes("-", sideSize);
        printNTimes("/", 1);

        System.out.println(); // Next line
    }

    private void printNormalMidLine() {
        printNTimes("|", 1);
        printNTimes(" ", sideSize);
        printNTimes("|", 1);
    }

    private void printNTimes(String charToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }

}
