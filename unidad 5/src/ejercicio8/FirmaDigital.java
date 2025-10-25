package ejercicio8;

import java.time.LocalDateTime;

public class FirmaDigital {
    private final String codigoHash;
    private final LocalDateTime fecha;
    private final Usuario usuario; // agregación

    public FirmaDigital(String codigoHash, LocalDateTime fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return String.format("FirmaDigital{codigoHash='%s', fecha=%s, usuario=%s}", codigoHash, fecha, usuario);
    }
}
