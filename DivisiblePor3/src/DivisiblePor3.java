
public class DivisiblePor3 {
    public static boolean esDivisiblePor3 (int input) {
        int suma = 0;

        for (int i = 1; i <= input; i++) {
            suma += i;
        }
        if (suma % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
