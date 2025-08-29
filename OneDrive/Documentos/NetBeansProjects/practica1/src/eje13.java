public class eje13 {

    public static void main(String[] args) {

        // a. Declarar e inicializar un array de precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Usar una función recursiva para mostrar los precios originales
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        // c. Modificar el precio de un producto específico (el tercer producto, índice 2)
        precios[2] = 129.99;

        // d. Usar la misma función recursiva para mostrar los valores modificados
        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios, 0);
    }

    /**
     * Función recursiva para imprimir los elementos de un array.
     * @param arr El array de precios a imprimir.
     * @param indice El índice actual para la recursión.
     */
    public static void imprimirPrecios(double[] arr, int indice) {
        // Caso base: La recursión se detiene cuando el índice es igual a la longitud del array
        if (indice >= arr.length) {
            return;
        }

        // Paso recursivo: Imprime el elemento actual y llama a la función para el siguiente índice
        System.out.println("Precio: $" + arr[indice]);
        imprimirPrecios(arr, indice + 1);
    }
}