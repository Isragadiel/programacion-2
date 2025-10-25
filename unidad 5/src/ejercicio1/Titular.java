// archivo: ejercicio1/Titular.java
package ejercicio1;
public class Titular {
    private final String nombre;
    private final String dni;
    private Pasaporte pasaporte; // asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     *
     * @param pasaporte
     */
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Pasaporte getPasaporte() { return pasaporte; }

    @Override
    public String toString() {
        return "Titular{" + "nombre='" + nombre + '\'' + ", dni='" + dni + '\'' + '}';
    }
}