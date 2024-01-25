package start.numeric;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import start.numeric.testutil.print.PrintVerifier;
import start.numeric.testutil.scanner.ScannerMocker;

class NumberEqualityValidatorAppTest {

    private PrintVerifier printVerifier;

    @BeforeEach
    void setUp() {
        printVerifier = new PrintVerifier();
    }

    @AfterEach
    void tearDown() {
        printVerifier.resetSystemOut();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1\n1\n1", "778\n778\n778", "-5\n-5\n-5"})
    void main_shouldPrintEqualMessage_whenNumbersEqual(String input) {
        ScannerMocker.mockScannerInput(input);

        NumberEqualityValidatorApp.main(null);

        printVerifier.assertSystemOut("These numbers are equal");
    }

    @ParameterizedTest
    @ValueSource(strings = {"1\n2\n3", "200\n0\n5327", "-5\n1000\n-16"})
    void main_shouldPrintUniqueMessage_whenNumbersUnique(String input) {
        ScannerMocker.mockScannerInput(input);

        NumberEqualityValidatorApp.main(null);

        printVerifier.assertSystemOut("These numbers are unique");
    }

    @ParameterizedTest
    @ValueSource(strings = {"2\n2\n3", "200\n5327\n5327", "-5\n1000\n-5"})
    void main_shouldPrintMixedMessage_whenNumbersMixed(String input) {
        ScannerMocker.mockScannerInput(input);

        NumberEqualityValidatorApp.main(null);

        printVerifier.assertSystemOut("These numbers include equal and different ones as well");
    }


}