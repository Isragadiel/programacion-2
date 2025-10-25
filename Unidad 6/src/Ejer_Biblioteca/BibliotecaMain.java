package Ejer_Biblioteca;

// BibliotecaMain.java
import java.util.List;

public class BibliotecaMain {
    public static void main(String[] args) {
        // 1. Creamos una biblioteca.
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombia");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Reino Unido");
        Autor a3 = new Autor("A003", "Jorge Luis Borges", "Argentina");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("ISBN003", "El Aleph", 1949, a3);
        biblioteca.agregarLibro("ISBN004", "Crónica de una muerte anunciada", 1981, a1);
        biblioteca.agregarLibro("ISBN005", "Harry Potter y la Cámara Secreta", 1998, a2);

        // 4. Listar todos los libros con su información y la del autor.
        System.out.println("=== Lista de libros ===");
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n=== Buscar ISBN003 ===");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) buscado.mostrarInfo();

        // 6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\n=== Filtrar por año 1997 ===");
        List<Libro> porAnio = biblioteca.filtrarLibrosPorAnio(1997);
        porAnio.forEach(Libro::mostrarInfo);

        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n=== Eliminar ISBN004 ===");
        boolean eliminado = biblioteca.eliminarLibro("ISBN004");
        System.out.println("Eliminado: " + eliminado);
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n=== Autores disponibles ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}
