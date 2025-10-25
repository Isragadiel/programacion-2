package ejercicio6;

public class Mesa {
    private final int numero;
    private final int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return String.format("Mesa{numero=%d, capacidad=%d}", numero, capacidad);
    }
}
