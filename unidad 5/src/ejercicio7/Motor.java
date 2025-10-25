package ejercicio7;

public class Motor {
    private final String tipo;
    private final String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return String.format("Motor{tipo='%s', numeroSerie='%s'}", tipo, numeroSerie);
    }
}
