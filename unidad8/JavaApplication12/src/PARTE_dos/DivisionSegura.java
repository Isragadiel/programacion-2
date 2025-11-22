package PARTE_dos;

public class DivisionSegura {
    public static void dividir(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
