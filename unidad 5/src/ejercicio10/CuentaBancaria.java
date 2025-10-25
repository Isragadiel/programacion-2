package ejercicio10;

import java.time.LocalDateTime;

public class CuentaBancaria {
    private final String cbu;
    private final double saldo;
    private final ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, LocalDateTime ultimaMod) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, ultimaMod);
    }

    public ClaveSeguridad getClave() { return clave; }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public Titular getTitular() { return titular; }

    @Override
    public String toString() {
        return String.format("CuentaBancaria{cbu='%s', saldo=%.2f, clave=%s}", cbu, saldo, clave);
    }
}
