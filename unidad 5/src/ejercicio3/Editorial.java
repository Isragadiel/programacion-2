package ejercicio3;

public class Editorial {
    private final String nombre;
    private final String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return String.format("Editorial{nombre='%s', direccion='%s'}", nombre, direccion);
    }
}
