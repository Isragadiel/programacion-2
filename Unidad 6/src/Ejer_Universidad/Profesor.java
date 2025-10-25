package Ejer_Universidad;
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return cursos; }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta cursos actualmente.");
            return;
        }
        System.out.println("Cursos de " + nombre + ":");
        cursos.forEach(c -> System.out.printf(" - %s (%s)%n", c.getCodigo(), c.getNombre()));
    }

    public void mostrarInfo() {
        System.out.printf("Profesor[id=%s, nombre=%s, especialidad=%s, cantidadCursos=%d]%n",
                id, nombre, especialidad, cursos.size());
    }
}
