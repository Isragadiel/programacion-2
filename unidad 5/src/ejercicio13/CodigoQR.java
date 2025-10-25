package ejercicio13;

public class CodigoQR {
    private final String valor;
    private final Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return String.format("CodigoQR{valor='%s', usuario=%s}", valor, usuario);
    }
}

