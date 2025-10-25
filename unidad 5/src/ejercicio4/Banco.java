package ejercicio4;

public class Banco {
    private final String nombre;
    private final String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return String.format("Banco{nombre='%s', cuit='%s'}", nombre, cuit);
    }
}
