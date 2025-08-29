import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Solicita los tres números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = scan.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scan.nextInt();

        // Determina el mayor de los tres números
        int mayor = num1; // Asume que el primer número es el mayor inicialmente

        if (num2 > mayor) {
            mayor = num2; // Si el segundo es mayor, actualiza la variable
        }

        if (num3 > mayor) {
            mayor = num3; // Si el tercero es mayor, actualiza la variable
        }

        // Muestra el resultado
        System.out.println("El mayor es: " + mayor);
    }
}
