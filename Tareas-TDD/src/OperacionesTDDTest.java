import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    static int actualResult;
    static int expectedResult;
    private static final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeAll
    static void setupAll() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @BeforeEach
    void setUp() {
        actualResult = expectedResult = 0;
        outputStreamCaptor.reset();
    }

    @ParameterizedTest
    @MethodSource("parametrizedtest")
    void parametrizedtest(String input, int expected, String expectedSout) {
        actualResult = OperacionesTDD.suma(input);
        expectedResult = expected;
        assertEquals(expectedSout, outputStreamCaptor.toString().trim());
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> parametrizedtest() {
        return Stream.of(
                Arguments.of("", 0, ""),
                Arguments.of("1", 1, ""),
                Arguments.of("1,2", 3, ""),
                Arguments.of("1,1,2", 4, ""),
                Arguments.of("1,2,", -1, ""),
                Arguments.of("1,2,-2", -1, "Número negativo no permitido"),
                Arguments.of("5,1002", 5, "Número superior a 1000 ignorado")
        );
    }

}