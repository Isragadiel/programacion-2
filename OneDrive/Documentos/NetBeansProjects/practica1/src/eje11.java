import java.util.Scanner;

public class eje11 {

    // Global variable for the special discount rate
    public static final double DESCUENTO_ESPECIAL = 0.10; // 10% discount

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get product price from the user
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();

        // Call the method to apply the special discount
        calcularDescuentoEspecial(precioProducto);
    }

    /**
     * Calculates and displays the special discount and final price.
     * @param precio The original price of the product.
     */
    public static void calcularDescuentoEspecial(double precio) {
        // Local variable to store the calculated discount amount
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        // Calculate final price
        double precioFinal = precio - descuentoAplicado;

        // Display the results
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}