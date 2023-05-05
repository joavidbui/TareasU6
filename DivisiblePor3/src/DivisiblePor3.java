
public class DivisiblePor3 {
    public static boolean esDivisiblePor3 (int input) {
        int suma = 0, resultadoDivision = 0;
        String numeroEntero = "";

        for (int i = 1; i <= input; i++) {
            numeroEntero = numeroEntero + "" + i;
            suma += suma + i;
        }
        resultadoDivision = Integer.parseInt(numeroEntero) / suma;
        if (resultadoDivision % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
