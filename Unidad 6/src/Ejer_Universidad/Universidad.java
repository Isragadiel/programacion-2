package Ejer_Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Universidad {
    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) != null) {
            System.out.println("Ya existe un profesor con id: " + p.getId());
            return;
        }
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) != null) {
            System.out.println("Ya existe un curso con codigo: " + c.getCodigo());
            return;
        }
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        return profesores.stream()
                .filter(p -> p.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        return cursos.stream()
                .filter(c -> c.getCodigo().equalsIgnoreCase(codigo))
                .findFirst()
                .orElse(null);
    }

    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor prof = buscarProfesorPorId(idProfesor);
        if (curso == null || prof == null) return false;
        curso.setProfesor(prof);
        return true;
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        profesores.forEach(Profesor::mostrarInfo);
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        cursos.forEach(Curso::mostrarInfo);
    }

    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) return false;
        // romper relación con profesor si existe
        if (c.getProfesor() != null) {
            c.setProfesor(null);
        }
        cursos.remove(c);
        return true;
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) return false;
        // dejar null los cursos que dictaba
        List<Curso> copia = p.getCursos().stream().collect(Collectors.toList());
        for (Curso c : copia) {
            c.setProfesor(null);
        }
        profesores.remove(p);
        return true;
    }

    public void reporteCantidadCursosPorProfesor() {
        System.out.println("=== Cantidad de cursos por profesor ===");
        for (Profesor p : profesores) {
            System.out.printf("%s: %d%n", p.getNombre(), p.getCursos().size());
        }
    }
}
