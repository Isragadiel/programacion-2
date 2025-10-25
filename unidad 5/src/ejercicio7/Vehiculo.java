package ejercicio7;

public class Vehiculo {
    private final String patente;
    private final String modelo;
    private final Motor motor; // agregación
    private Conductor conductor; // bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Motor getMotor() { return motor; }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public Conductor getConductor() { return conductor; }

    @Override
    public String toString() {
        return String.format("Vehiculo{patente='%s', modelo='%s', motor=%s}", patente, modelo, motor);
    }
}
