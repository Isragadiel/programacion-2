package javaapplication13;

public class TestEmpleado {
    public static void main(String[] args) {

        // Instancias usando el constructor completo
        Empleado e1 = new Empleado(101, "Carlos López", "Gerente", 250000);
        Empleado e2 = new Empleado(102, "Ana Torres", "Analista", 180000);

        // Instancias usando el constructor con nombre y puesto
        Empleado e3 = new Empleado("Juan Pérez", "Desarrollador");
        Empleado e4 = new Empleado("María Díaz", "Tester");

        // Aplicar aumentos
        e1.actualizarSalario(10);     // 10% aumento
        e3.actualizarSalario(20000);  // aumento fijo

        // Mostrar información de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total de empleados creados
        System.out.println("\nTotal empleados creados: " +
                Empleado.mostrarTotalEmpleados());
    }
}
