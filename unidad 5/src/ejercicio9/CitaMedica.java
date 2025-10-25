package ejercicio9;

import java.time.LocalDate;
import java.time.LocalTime;

public class CitaMedica {
    private final LocalDate fecha;
    private final LocalTime hora;
    private final Paciente paciente;
    private final Profesional profesional;

    public CitaMedica(LocalDate fecha, LocalTime hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return String.format("CitaMedica{fecha=%s, hora=%s, paciente=%s, profesional=%s}", fecha, hora, paciente, profesional);
    }
}
