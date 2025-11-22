package parte_uno;

public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal por $" + monto);
    }
}
