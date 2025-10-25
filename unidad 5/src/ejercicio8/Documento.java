package ejercicio8;

import java.time.LocalDateTime;

public class Documento {
    private final String titulo;
    private final String contenido;
    private final FirmaDigital firma; // composición

    public Documento(String titulo, String contenido, String codigoHash, LocalDateTime fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    @Override
    public String toString() {
        return String.format("Documento{titulo='%s', contenido='%s', firma=%s}", titulo, contenido, firma);
    }
}
