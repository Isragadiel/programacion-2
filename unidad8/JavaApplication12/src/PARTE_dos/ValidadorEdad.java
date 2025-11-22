package PARTE_dos;

public class ValidadorEdad {
    public static void validar(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
        System.out.println("Edad correcta: " + edad);
    }
}
