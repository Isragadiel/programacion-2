package ejercicio9;

public class Profesional {
    private final String nombre;
    private final String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return String.format("Profesional{nombre='%s', especialidad='%s'}", nombre, especialidad);
    }
}
