
public class DivisiblePor3 {
    public static boolean esDivisiblePor3 (int input) {
        int suma = 0;
        for (int i = 1; i <= input; i++) {
            suma += i;
        }
        return suma % 3 == 0;
    }
}