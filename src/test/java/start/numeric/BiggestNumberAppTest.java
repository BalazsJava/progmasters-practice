package start.numeric;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import start.numeric.testutil.print.PrintVerifier;
import start.numeric.testutil.scanner.ScannerMocker;

import java.util.stream.Stream;

class BiggestNumberAppTest {

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
    void main_shouldPrintMaxMessage_whenNumbersEqual(String input) {
        ScannerMocker.mockScannerInput(input);

        BiggestNumberApp.main(null);

        printVerifier.assertSystemOut("The biggest");
    }

    @ParameterizedTest
    @MethodSource("biggestNumbers")
    void main_shouldPrintBiggestNumber_whenNumbersUnique(TestCase testCase) {
        ScannerMocker.mockScannerInput(testCase.input);

        BiggestNumberApp.main(null);

        printVerifier.assertSystemOut(testCase.expectedResult);
    }

    public static Stream<TestCase> biggestNumbers() {
        return Stream.of(
                new TestCase("1\n2\n3", "3"),
                new TestCase("200\n0\n5327", "5327"),
                new TestCase("-5\n-100\n-16", "-5"),
                new TestCase(Integer.MIN_VALUE + "\n52351\n" + Integer.MAX_VALUE, String.valueOf(Integer.MAX_VALUE))
        );
    }

    record TestCase(String input, String expectedResult) {

    }

}