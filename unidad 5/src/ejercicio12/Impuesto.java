package ejercicio12;

public class Impuesto {
    private final double monto;
    private final Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() { return monto; }

    @Override
    public String toString() {
        return String.format("Impuesto{monto=%.2f, contribuyente=%s}", monto, contribuyente);
    }
}
