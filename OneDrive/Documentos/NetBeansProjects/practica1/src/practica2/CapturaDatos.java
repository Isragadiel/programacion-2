package practica2;
import java.util.Scanner;
public class CapturaDatos {
    public static void main(String[] args) {
        // 1. Crear una instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        // 2. Solicitar y capturar el nombre del usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        // 3. Solicitar y capturar la edad del usuario
        System.out.print("Ahora, ingresa tu edad: ");
        int edad = scanner.nextInt();
        // 4. Mostrar los datos capturados
        System.out.println("\n¡Hola, " + nombre + "!");
        System.out.println("Tu edad es: " + edad + " años.");
        // 5. Cerrar el objeto Scanner
        scanner.close();
    }
}
