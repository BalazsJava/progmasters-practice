package start.numeric.testutil.scanner;

import java.io.ByteArrayInputStream;

public class ScannerMocker {

    public static void mockScannerInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

}
