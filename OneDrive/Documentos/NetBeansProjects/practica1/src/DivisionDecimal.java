import java.util.Scanner;

public class DivisionDecimal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- División de números con decimales ---");
        System.out.print("Ingresa el dividendo (número 1): ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingresa el divisor (número 2): ");
        double numero2 = scanner.nextDouble();
        
        // La división de dos doubles produce un double, manteniendo la parte decimal
        double resultado = numero1 / numero2;
        
        System.out.println("El resultado de la división con decimales es: " + resultado);
        
        scanner.close();
    }
}
