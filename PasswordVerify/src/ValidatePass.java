public class ValidatePass {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean validate(String input) {
        boolean valido = true;

        if (input.length() < 8) {
            System.out.println("La contrasenya ha de tenir almenys 8 caràcters");
            valido = false;
        }
        if (input.length() - input.replaceAll("[0-9]", "").length() < 2) {
            System.out.println("La contrasenya ha de contenir almenys 2 números");
            valido = false;
        }

        if (input.length() - input.replaceAll("[A-Z]|[ÁÉÍÓÚÀÈÌÒÙ]", "").length() < 1) {
            System.out.println("La contrasenya ha de contenir almenys una lletra majúscula");
            valido = false;
        }

        if (input.length() - input.replaceAll("[\\W]", "").length() < 1) {
            System.out.println("La contrasenya ha de contenir almenys un caràcter especial");
            valido = false;
        }

        return valido;
    }
}