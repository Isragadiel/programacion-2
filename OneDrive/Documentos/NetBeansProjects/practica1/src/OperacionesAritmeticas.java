import java.util.Scanner;
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        // Crear una instancia de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar el primer número
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();
        // Realizar las operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        if (numero2 != 0) {
            double division = (double) numero1 / numero2;
            System.out.println("--- Resultados ---");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
        } else {
            System.out.println("--- Resultados ---");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("Error: No se puede dividir por cero.");
        }
        scanner.close();
    }
}
