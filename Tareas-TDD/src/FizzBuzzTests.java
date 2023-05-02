import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void notMutiple3nor5_shouldReturnNumberAsString (int number) {
        String actualOutput = FizzBuzz.getFizzBuzz(number);
        String desiredOutput = String.valueOf(number);
        Assertions.assertEquals(actualOutput, desiredOutput);
    }
    @ParameterizedTest
    @ValueSource(ints = {3})
    void multiple3_shouldReturnFizz (int number) {
        String actualOutput = FizzBuzz.getFizzBuzz(number);
        String desiredOutput = "Fizz";
        Assertions.assertEquals(actualOutput, desiredOutput);
    }
}
