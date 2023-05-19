import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class TestTDDSong {

    @ParameterizedTest
    @MethodSource("parametrizedtest")
    void parametrizedtest(ArrayList<String> input, String expectedOutput) {
        Assertions.assertEquals(expectedOutput, TDDSong.createSong(input));
    }

    private static Stream<Arguments> parametrizedtest() {
        return Stream.of(
                Arguments.of(new ArrayList<String>(List.of()), ""),
                Arguments.of(new ArrayList<>(List.of("fly")),
                        """
                                There was an old lady who swallowed a fly.
                                I don't know why she swallowed a fly - perhaps she'll die!
                                """),
                Arguments.of(new ArrayList<>(List.of("spider")),
                        """
                                There was an old lady who swallowed a spider.
                                I don't know why she swallowed a spider - perhaps she'll die!
                                """),
                Arguments.of(new ArrayList<>(Arrays.asList("fly", "spider")),
                        """
                                There was an old lady who swallowed a fly.
                                I don't know why she swallowed a fly - perhaps she'll die!

                                There was an old lady who swallowed a spider;
                                That wriggled and wiggled and tickled inside her.
                                She swallowed the spider to catch the fly;
                                I don't know why she swallowed a fly - perhaps she'll die!
                                """),
                Arguments.of(new ArrayList<>(Arrays.asList("spider", "fly")),
                        """
                                There was an old lady who swallowed a spider.
                                I don't know why she swallowed a spider - perhaps she'll die!

                                There was an old lady who swallowed a fly;
                                That wriggled and wiggled and tickled inside her.
                                She swallowed the fly to catch the spider;
                                I don't know why she swallowed a spider - perhaps she'll die!
                                """),
                Arguments.of(new ArrayList<>(Arrays.asList("fly", "spider", "bird")),
                        """
                                There was an old lady who swallowed a fly.
                                I don't know why she swallowed a fly - perhaps she'll die!

                                There was an old lady who swallowed a spider;
                                That wriggled and wiggled and tickled inside her.
                                She swallowed the spider to catch the fly;
                                I don't know why she swallowed a fly - perhaps she'll die!

                                There was an old lady who swallowed a bird;
                                How absurd to swallow a bird.
                                She swallowed the bird to catch the spider,
                                She swallowed the spider to catch the fly;
                                I don't know why she swallowed a fly - perhaps she'll die!

                                """),
                Arguments.of(new ArrayList<>(Arrays.asList("bird", "fly", "spider")),
                        """
                                There was an old lady who swallowed a bird.
                                I don't know why she swallowed a bird - perhaps she'll die!

                                There was an old lady who swallowed a fly;
                                That wriggled and wiggled and tickled inside her.
                                She swallowed the fly to catch the bird;
                                I don't know why she swallowed a bird - perhaps she'll die!

                                There was an old lady who swallowed a spider;
                                How absurd to swallow a spider.
                                She swallowed the spider to catch the fly,
                                She swallowed the fly to catch the bird;
                                I don't know why she swallowed a bird - perhaps she'll die!

                                """

                ));
    }
}
