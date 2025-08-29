import java.util.Scanner;

public class ejer_9{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get current stock, sold quantity, and received quantity from the user
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scan.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scan.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt();

        // Call the method to calculate the new stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Display the updated stock
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    /**
     * Calculates the new stock level.
     * @param stockActual The current stock.
     * @param cantidadVendida The quantity sold.
     * @param cantidadRecibida The quantity received.
     * @return The updated stock level.
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}