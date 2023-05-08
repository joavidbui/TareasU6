import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidatePassTests {
    private static final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeAll
    static void setupAll() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @BeforeEach
    void setUp() {
        outputStreamCaptor.reset();
    }

    @ParameterizedTest
    @MethodSource("parametrizedtest")
    void parametrizedtest(String input, boolean expected, String expectedSout) {
        assertEquals(expected, ValidatePass.validate(input));
        assertEquals(expectedSout, outputStreamCaptor.toString());
    }

    private static Stream<Arguments> parametrizedtest() {
        return Stream.of(
                Arguments.of("", false,
                        "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys un caràcter especial" + System.lineSeparator()),
                Arguments.of("hola", false,
                        "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys un caràcter especial" + System.lineSeparator()),
                Arguments.of("holacaracola", false,
                        "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys un caràcter especial" + System.lineSeparator()),
                Arguments.of("hola12", false,
                        "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys un caràcter especial" + System.lineSeparator()),
                Arguments.of("holA", false,
                        "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys un caràcter especial" + System.lineSeparator()),
                Arguments.of("hola!", false,
                        "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator()),
                Arguments.of("holaA!", false,
                        "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator()),
                Arguments.of("hola12!", false,
                        "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator()),
                Arguments.of("hola12A", false,
                        "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys un caràcter especial" + System.lineSeparator()),
                Arguments.of("holacaracola12", false,
                        "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys un caràcter especial" + System.lineSeparator()),
                Arguments.of("holacaracola!", false,
                        "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator()),
                Arguments.of("holacaracolA", false,
                        "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator() +
                                "La contrasenya ha de contenir almenys un caràcter especial" + System.lineSeparator()),
                Arguments.of("ho12A!", false,
                        "La contrasenya ha de tenir almenys 8 caràcters" + System.lineSeparator()),
                Arguments.of("holacaracolA!", false,
                        "La contrasenya ha de contenir almenys 2 números" + System.lineSeparator()),
                Arguments.of("holacaracola12!", false,
                                "La contrasenya ha de contenir almenys una lletra majúscula" + System.lineSeparator()),
                Arguments.of("holacaracola12A", false,
                                "La contrasenya ha de contenir almenys un caràcter especial" + System.lineSeparator()),
                Arguments.of("holacaracola12A!", true, ""),
                Arguments.of("#P4blit0cl4v0uncl4vit0#", true, "")
        );
    }
}
