package ejercicio3;

public class Libro {
    private final String titulo;
    private final String isbn;
    private final Autor autor;
    private final Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return String.format("Libro{titulo='%s', isbn='%s', autor=%s, editorial=%s}", titulo, isbn, autor, editorial);
    }
}
