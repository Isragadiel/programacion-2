package ejercicio14;

public class Proyecto {
    private final String nombre;
    private final int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return String.format("Proyecto{nombre='%s', duracionMin=%d}", nombre, duracionMin);
    }
}
