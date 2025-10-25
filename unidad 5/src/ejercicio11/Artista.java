package ejercicio11;

public class Artista {
    private final String nombre;
    private final String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return String.format("Artista{nombre='%s', genero='%s'}", nombre, genero);
    }
}
