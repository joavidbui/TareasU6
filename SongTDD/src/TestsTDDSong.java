import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


public class TestsTDDSong {

    @ParameterizedTest
    @MethodSource("parametrizedtest")
    void parametrizedtest(ArrayList<String> input, String expectedOutput) {
        Assertions.assertEquals(TDDSong.createSong(input), expectedOutput);
    }

    private static Stream<Arguments> parametrizedtest() {
        return Stream.of(
                Arguments.of(new ArrayList<String>(Arrays.asList()), "")
        );
    }
}
