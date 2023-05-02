public class OperacionesTDD {
    public static int suma(String input) {
        String trimInput = input.trim();

        if (trimInput.equals("")) return 0;
        else return Integer.parseInt(input);
    }
}
