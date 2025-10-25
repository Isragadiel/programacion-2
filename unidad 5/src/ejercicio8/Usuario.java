package ejercicio8;

public class Usuario {
    private final String nombre;
    private final String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Usuario{nombre='%s', email='%s'}", nombre, email);
    }
}
