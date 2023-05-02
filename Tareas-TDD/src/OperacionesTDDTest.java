import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    static int actualResult;
    static int expectedResult;

    @BeforeEach
    void setUp() {
        actualResult = expectedResult = 0;
    }

    @ParameterizedTest
    @MethodSource("parametrizedtest")
    void parametrizedtest(String input, int expected) {
        actualResult = OperacionesTDD.suma(input);
        expectedResult = expected;
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> parametrizedtest() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("1", 1)
        );
    }

}