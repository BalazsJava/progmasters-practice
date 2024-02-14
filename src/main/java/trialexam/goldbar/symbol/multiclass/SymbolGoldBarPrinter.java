package trialexam.goldbar.symbol.multiclass;

public class SymbolGoldBarPrinter {

    private final int size;
    private final int sideSize;
    private final int halfSideSize;

    public SymbolGoldBarPrinter(int size) {
        this.size = size;
        this.sideSize = size - 2;
        this.halfSideSize = sideSize / 2;
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
        int symbolLine = calculateMiddleOfSideSize(); // Can't print in middle at even size

        for (int i = 0; i < sideSize; i++) {
            if (i == symbolLine) {
                printSymbolMidLine();
            } else {
                printNormalMidLine();
            }
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

    private void printSymbolMidLine() {
        int spacesToSymbol = calculateMiddleOfSideSize(); // Can't print in middle at even size

        printNTimes("|", 1);
        printNTimes(" ", spacesToSymbol);
        printNTimes("G", 1);
        printNTimes(" ", halfSideSize);
        printNTimes("|", 1);
    }

    private int calculateMiddleOfSideSize() {
        return size % 2 == 0 ? halfSideSize - 1 : halfSideSize;
    }

    private void printNTimes(String charToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }

}
