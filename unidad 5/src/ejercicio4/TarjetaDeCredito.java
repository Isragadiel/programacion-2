package ejercicio4;

import java.time.LocalDate;

public class TarjetaDeCredito {
    private final String numero;
    private final LocalDate fechaVencimiento;
    private final Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public Banco getBanco() { return banco; }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public Cliente getCliente() { return cliente; }

    @Override
    public String toString() {
        return String.format("TarjetaDeCredito{numero='%s', fechaVencimiento=%s, banco=%s}", numero, fechaVencimiento, banco);
    }
}
