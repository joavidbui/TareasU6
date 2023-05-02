import java.util.Arrays;

public class OperacionesTDD {
    public static int suma(String input) {
        String trimInput = input.trim();

        if (trimInput.equals("")) return 0;

        return Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
