package ejercicio6;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private final LocalDate fecha;
    private final LocalTime hora;
    private final Cliente cliente; // asociación unidireccional
    private final Mesa mesa;       // agregación

    public Reserva(LocalDate fecha, LocalTime hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return String.format("Reserva{fecha=%s, hora=%s, cliente=%s, mesa=%s}", fecha, hora, cliente, mesa);
    }
}
