// ejercicio2/Bateria.java
package ejercicio2;

public class Bateria {
    private final String modelo;
    private final int capacidad; // mAh

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() { return modelo; }
    public int getCapacidad() { return capacidad; }

    @Override
    public String toString() {
        return String.format("Bateria{modelo='%s', capacidad=%d}", modelo, capacidad);
    }
}