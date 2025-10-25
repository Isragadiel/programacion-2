package ejercicio11;

public class Cancion {
    private final String titulo;
    private final Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return String.format("Cancion{titulo='%s', artista=%s}", titulo, artista);
    }
}
