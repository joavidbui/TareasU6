import java.util.Arrays;

public class OperacionesTDD {
    public static int suma(String input) {
        int output = 0;
        String trimInput = input.trim();

        if (trimInput.equals("")) return 0;
        if (trimInput.charAt(trimInput.length()-1) == ',') return -1;

        int[] arrayInts = Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int integer : arrayInts) {
            if (integer < 0) {
                System.out.println("Número negativo no permitido");
                return -1;
            }
            if (integer > 1000) {
                System.out.println("Número superior a 1000 ignorado");
                continue;
            }
            output += integer;
        }
        return output;
    }
}
