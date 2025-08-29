import java.util.Scanner;

public class ejercicio_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Solicita la edad al usuario
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();

        // Clasifica la etapa de vida usando una estructura if-else if-else
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else { // Si la edad no cumple ninguna de las condiciones anteriores, es 60 o más
            System.out.println("Eres un Adulto mayor.");
        }
    }
}
