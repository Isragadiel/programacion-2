package ejercicio6;

public class Cliente {
    private final String nombre;
    private final String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return String.format("Cliente{nombre='%s', telefono='%s'}", nombre, telefono);
    }
}
