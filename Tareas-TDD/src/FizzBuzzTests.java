import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8, 11, 13, 14})
    void notMutiple3nor5_shouldReturnNumberAsString (int number) {
        String actualOutput = FizzBuzz.getFizzBuzz(number);
        String desiredOutput = String.valueOf(number);
        Assertions.assertEquals(actualOutput, desiredOutput);
    }
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void multiple3_shouldReturnFizz (int number) {
        String actualOutput = FizzBuzz.getFizzBuzz(number);
        String desiredOutput = "Fizz";
        Assertions.assertEquals(actualOutput, desiredOutput);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    void multiple5_shouldReturnBuzz (int number) {
        String actualOutput = FizzBuzz.getFizzBuzz(number);
        String desiredOutput = "Buzz";
        Assertions.assertEquals(actualOutput, desiredOutput);
    }

    @ParameterizedTest
    @ValueSource(ints = {15})
    void multiple3and5_shouldReturnFizzBuzz (int number) {
        String actualOutput = FizzBuzz.getFizzBuzz(number);
        String desiredOutput = "FizzBuzz";
        Assertions.assertEquals(actualOutput, desiredOutput);
    }
}
