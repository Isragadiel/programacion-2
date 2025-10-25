// ejercicio2/Usuario.java
package ejercicio2;

public class Usuario {
    private final String nombre;
    private final String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public Celular getCelular() { return celular; }

    @Override
    public String toString() {
        return String.format("Usuario{nombre='%s', dni='%s'}", nombre, dni);
    }
}