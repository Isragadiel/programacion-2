package PARTE_dos;

import java.util.Scanner;

public class ConvertirNumero {

    public static void convertir() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto no es un número válido.");
        }
    }
}
