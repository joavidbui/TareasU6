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
        Assertions.assertEquals(expectedOutput, TDDSong.createSong(input));
    }

    private static Stream<Arguments> parametrizedtest() {
        return Stream.of(
                Arguments.of(new ArrayList<String>(Arrays.asList()), ""),
                Arguments.of(new ArrayList<>(Arrays.asList("fly")),
                        "There was an old lady who swallowed a fly.\n" +
                                "I don't know why she swallowed a fly - perhaps she'll die!\n"),
                Arguments.of(new ArrayList<>(Arrays.asList("spider")),
                        "There was an old lady who swallowed a spider.\n" +
                                "I don't know why she swallowed a spider - perhaps she'll die!\n"));
    }
}
