import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DivisiblePor3Tests {
    @ParameterizedTest
    @ValueSource(ints = {2, 6, 251, -3})
    void esDivisibleEntreTres_devuelveTrue(int input) {
        Assertions.assertTrue(DivisiblePor3.esDivisiblePor3(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 7, 250, 7})
    void noEsDivisibleEntreTres_devuelveFalse(int input) {
        Assertions.assertFalse(DivisiblePor3.esDivisiblePor3(input));
    }
}
