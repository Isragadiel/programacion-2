public class eje12 {
    public static void main(String[] args) {

        // a. Declarar e inicializar un array con los precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Mostrar los valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // c. Modificar el precio de un producto específico (el tercer producto, índice 2)
        // El precio de 149.75 se cambia a 129.99
        precios[2] = 129.99;

        // d. Mostrar los valores modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}