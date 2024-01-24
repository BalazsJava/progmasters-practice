package start.numeric.testutil.print;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class PrintVerifier {

    private final ByteArrayOutputStream outputStream;

    public PrintVerifier() {
        this.outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    public void assertSystemOut(String expectedOutput) {
        String actualOutput = outputStream.toString().trim();
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    public void resetSystemOut() {
        System.setOut(System.out);
    }

}
