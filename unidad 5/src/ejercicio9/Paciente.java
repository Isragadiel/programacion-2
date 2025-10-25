package ejercicio9;

public class Paciente {
    private final String nombre;
    private final String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return String.format("Paciente{nombre='%s', obraSocial='%s'}", nombre, obraSocial);
    }
}
