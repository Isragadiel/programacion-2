import java.util.Scanner;

public class ejerccio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get product price
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Get product category
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().charAt(0);

        double descuento = 0.0;

        // Determine the discount percentage based on the category
        switch (categoria) {
            case 'A':
            case 'a':
                descuento = 0.10; // 10%
                System.out.println("Descuento aplicado: 10%");
                break;
            case 'B':
            case 'b':
                descuento = 0.15; // 15%
                System.out.println("Descuento aplicado: 15%");
                break;
            case 'C':
            case 'c':
                descuento = 0.20; // 20%
                System.out.println("Descuento aplicado: 20%");
                break;
            default:
                System.out.println("Categoría no válida. No se aplica descuento.");
                break;
        }

        // Calculate final price
        double precioFinal = precio - (precio * descuento);

        // Display the final price
        System.out.println("Precio final: " + precioFinal);
    }
}
