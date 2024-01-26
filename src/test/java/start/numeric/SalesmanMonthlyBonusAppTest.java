package start.numeric;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import start.numeric.testutil.print.PrintVerifier;
import start.numeric.testutil.scanner.ScannerMocker;

import java.util.stream.Stream;

class SalesmanMonthlyBonusAppTest {

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
    @MethodSource("getValidSales")
    void main_shouldPrintBonus_whenValidMonthlySales(TestCase testCase) {
        ScannerMocker.mockScannerInput(testCase.input);

        SalesmanMonthlyBonusApp.main(null);

        printVerifier.assertSystemOut("""
                Enter your monthly sales:
                Bonus: %s""".formatted(testCase.expectedResult));
    }

    @ParameterizedTest
    @ValueSource(strings = {"999999", "10", "-100", "500000"})
    void main_shouldPrintNoBonus_whenInvalidMonthlySales(String input) {
        ScannerMocker.mockScannerInput(input);

        SalesmanMonthlyBonusApp.main(null);

        printVerifier.assertSystemOut("""
                Enter your monthly sales:
                Bonus: %s""".formatted("0"));
    }

    public static Stream<TestCase> getValidSales() {
        return Stream.of(
                new TestCase("1000000", "100000"),
                new TestCase("2000000", "200000"),
                new TestCase("50000000", "5000000"),
                new TestCase("1599440", "159944")
        );
    }

    record TestCase(String input, String expectedResult) {

    }

}