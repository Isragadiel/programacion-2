// archivo: ejercicio1/Pasaporte.java
package ejercicio1;

import java.time.LocalDate;

public class Pasaporte {
    private final String numero;
    private final LocalDate fechaEmision;
    private final ejercicio1.Foto foto; // composición: final, creada con el pasaporte
    private ejercicio1.Titular titular; // asociación bidireccional

    public Pasaporte(String numero, LocalDate fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // composición: Pasaporte crea la Foto
        this.foto = new ejercicio1.Foto(imagenFoto, formatoFoto);
    }

    public ejercicio1.Foto getFoto() { return foto; }

    public void setTitular(ejercicio1.Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this); // mantener bidireccionalidad
        }
    }

    public ejercicio1.Titular getTitular() { return titular; }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero='" + numero + '\'' + ", fechaEmision=" + fechaEmision + ", foto=" + foto + '}';
    }
}

