package start.numeric.testutil.print;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PrintVerifier {

    private final ByteArrayOutputStream outputStream;

    public PrintVerifier() {
        this.outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    public void assertSystemOut(String expectedOutput) {
        String actualOutput = outputStream.toString().trim();

        String normalizedActualOutput = normalize(actualOutput);
        String normalizedExpectedOutput = normalize(expectedOutput);

        assertThat(normalizedActualOutput).isEqualTo(normalizedExpectedOutput);
    }

    public void resetSystemOut() {
        System.setOut(System.out);
    }

    private String normalize(String actualOutput) {
        actualOutput = actualOutput.replace("\r\n", "\n");
        actualOutput = Arrays.stream(actualOutput.split("\\n"))
                .map(String::trim)
                .collect(Collectors.joining());
        return actualOutput;
    }

}
