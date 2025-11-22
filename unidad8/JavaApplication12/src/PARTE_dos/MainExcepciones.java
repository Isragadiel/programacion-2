package PARTE_dos;

public class MainExcepciones {
    public static void main(String[] args) {

        // 1. División segura
        DivisionSegura.dividir(10, 0);

        // 2. Conversión de cadena a número
        ConvertirNumero.convertir();

        // 3. Lectura de archivo
        LecturaArchivo.leer("archivo.txt");

        // 4. Edad inválida
        try {
            ValidadorEdad.validar(150);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

        // 5. Try-with-resources
        LecturaSegura.leer("archivo.txt");
    }
}

