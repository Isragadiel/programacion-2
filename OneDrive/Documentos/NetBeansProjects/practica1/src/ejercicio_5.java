import java.util.Scanner;

public class ejercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int numero;

        // Loop to get numbers and sum even ones
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            // Check if the number is 0 to exit the loop
            if (numero == 0) {
                break;
            }

            // Check if the number is even and add it to the sum
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        }

        // Display the total sum of even numbers
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
