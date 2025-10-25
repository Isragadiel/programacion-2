package Ejer_Universidad;
public class UniversidadMain {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Ejemplo");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor prof1 = new Profesor("PR01", "María Pérez", "Matemáticas");
        Profesor prof2 = new Profesor("PR02", "Juan López", "Programación");
        Profesor prof3 = new Profesor("PR03", "Ana Gómez", "Física");

        Curso c1 = new Curso("C001", "Álgebra I");
        Curso c2 = new Curso("C002", "Programación I");
        Curso c3 = new Curso("C003", "Física I");
        Curso c4 = new Curso("C004", "Estructuras de Datos");
        Curso c5 = new Curso("C005", "Cálculo I");

        // 2. Agregar profesores y cursos a la universidad.
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        uni.asignarProfesorACurso("C001", "PR01"); // Álgebra -> María
        uni.asignarProfesorACurso("C002", "PR02"); // Programación -> Juan
        uni.asignarProfesorACurso("C003", "PR03"); // Física -> Ana
        uni.asignarProfesorACurso("C004", "PR02"); // Estructuras -> Juan

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("=== Cursos registrados ===");
        uni.listarCursos();
        System.out.println("\n=== Profesores registrados ===");
        uni.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\n=== Cambiar profesor de C004 a PR01 ===");
        uni.asignarProfesorACurso("C004", "PR01"); // reasigna estructuras a María
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n=== Eliminar curso C002 ===");
        uni.eliminarCurso("C002"); // Programación I eliminado
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();

        // 7. Remover un profesor y dejar profesor = null en sus cursos.
        System.out.println("\n=== Eliminar profesor PR03 (Ana) ===");
        uni.eliminarProfesor("PR03");
        uni.listarProfesores();
        System.out.println();
        uni.listarCursos();

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println();
        uni.reporteCantidadCursosPorProfesor();
    }
}
