package ejercicio12;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double iva = impuesto.getMonto() * 0.21;
        System.out.printf("Cálculo: %s | IVA (21%%)=%.2f%n", impuesto, iva);
    }
}
