package KATA_3;

import java.util.ArrayList;

public class MainEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Mario", 300000));
        empleados.add(new EmpleadoTemporal("Carla", 80, 2000));

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " cobra: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("-> Es empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("-> Es empleado temporal");
            }
        }
    }
}
